package be.vdab;


import be.vdab.domain.Cars;
import be.vdab.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.condition.ConsumesRequestCondition;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.function.Consumer;


/**
 * Created by jeansmits on 7/07/15.
 */

@RestController
@RequestMapping("car")
public class CarsController {
    @Autowired
    CarsRepository carsRepository;

    @RequestMapping(value="/{carId}")
    public Cars findById(@PathVariable("carId") int id){
        return carsRepository.findOne(id);
    }

    @RequestMapping("/allcars")
    public String findAll() {
        return carsRepository.findAll().toString();
    }

    @RequestMapping(value = "/create" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity <Void> create (@RequestBody Cars cars){
        carsRepository.save(cars);
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.add("Location" , "http://localhost:8080/car/" + cars.getId());
        return new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);
    }


}
