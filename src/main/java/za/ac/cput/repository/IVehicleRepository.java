package za.ac.cput.repository;

/*IVehicleRepository.java
  interface for the Vehicle
  Author: Zintle Zothe (216130565)
  Date: 08 April 2022
 */

import za.ac.cput.entity.Vehicle;
import java.util.Set;

public interface IVehicleRepository extends IRepository<Vehicle, String> {
    public Set<Vehicle> getAll();
}