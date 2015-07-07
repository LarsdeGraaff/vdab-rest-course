package be.vdab.repository;

import be.vdab.domain.Car;
import be.vdab.domain.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by jeansmits on 7/07/15.
 */
@Repository
public interface CarsRepository extends JpaRepository<Cars,Integer> {

}
