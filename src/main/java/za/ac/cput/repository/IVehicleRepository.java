package za.ac.cput.repository;

/*IVehicleRepository.java
  interface for the Vehicle
  Author: Zintle Zothe (216130565)
  Date: 08 April 2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Vehicle;
import java.util.List;
import za.ac.cput.repository.IRepository;




@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, String> {
    public List<Vehicle> getAll();
}