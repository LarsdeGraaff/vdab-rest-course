package be.vdab.repository;

import be.vdab.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jeansmits on 6/07/15.
 */
public interface CarRepository extends JpaRepository<Car,Integer>{
}
