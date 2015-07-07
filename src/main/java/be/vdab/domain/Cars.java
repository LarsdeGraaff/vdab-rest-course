package be.vdab.domain;

import javax.persistence.*;

/**
 * Created by jeansmits on 7/07/15.
 */
@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nummerPlaat;
    @ManyToOne
    private Model model;


    public Cars(Integer id, String nummerPlaat ) {
        this.id = id;
        this.nummerPlaat = nummerPlaat;
    }


    public Cars() {
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNummerPlaat() {
        return nummerPlaat;
    }

    public void setNummerPlaat(String nummerPlaat) {
        this.nummerPlaat = nummerPlaat;
    }


    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", nummerPlaat='" + nummerPlaat + '\'' +
                '}';
    }
}
