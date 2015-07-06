package be.vdab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

@WebServlet(urlPatterns="/service")
public class MessageServlet extends HttpServlet {
    private static List<Message> messages  = Arrays.asList(
        new Message("Kevin", new Date(), "Hello World"),
        new Message("Janis", new Date(), "I love my Mercedes!"),
        new Message("Jimi", new Date(), "I see a purple haze everywhere."),
        new Message("Kurt", new Date(), "That's that smell?")
    );


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Message message = randomMessage();
        resp.setContentType("application/json");
        resp.getWriter().println("{\"body\": \"" + message.getBody() + "\", \"user\": \"" + message.getUser() + "\", \"timestamp\": \"" + message.getTimestamp().getTime() + "\"}");
    }

    private Message randomMessage() {
        return messages.get(new Random(System.nanoTime()).nextInt(messages.size()));
    }
}

class Message {
    private String user;
    private Date timestamp;
    private String body;

    public Message(String user, Date timestamp, String body) {
        this.user = user;
        this.timestamp = timestamp;
        this.body = body;
    }

    public String getUser() {
        return user;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getBody() {
        return body;
    }
}