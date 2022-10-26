package za.ac.cput.repository;

/*VehicleRepository.java
  interface for the Vehicle
  Author: Zintle Zothe (216130565)
  Date: 08 April 2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Vehicle;
import java.util.List;



@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {
//     Vehicle findVehicleGivenUserId(String userID);
//     List<Vehicle> findVehiclesGivenUserId(String userID);
}