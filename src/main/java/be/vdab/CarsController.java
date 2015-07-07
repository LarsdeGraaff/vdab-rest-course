package be.vdab;

import be.vdab.domain.Car;
import be.vdab.domain.Cars;
import be.vdab.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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




}
