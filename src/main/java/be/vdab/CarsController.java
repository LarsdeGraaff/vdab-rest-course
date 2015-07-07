package be.vdab;

import be.vdab.domain.Car;
import be.vdab.domain.Cars;
import be.vdab.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jeansmits on 7/07/15.
 */

@RestController
@RequestMapping("car")
public class CarsController {
    @Autowired
    CarsRepository carsRepository;

//    @RequestMapping("/cars")
//    @ResponseBody
//    public String findAll(@RequestParam("id") int Id){
//
//        return carsRepository.findAll().toString();
//
//    }

    @RequestMapping("/cars")
    @ResponseBody
    public String findAll() {
        return carsRepository.findAll().toString();
    }



}
