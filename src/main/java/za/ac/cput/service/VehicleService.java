/*VehicleService.java
  interface for the VehicleService
  Author: Zintle Zothe (216130565)
  Date: August 2022
 */
package za.ac.cput.service;


import za.ac.cput.entity.Vehicle;

import java.util.List;

public interface VehicleService extends IService<Vehicle,String>{
    public List<Vehicle> getAll();

}
