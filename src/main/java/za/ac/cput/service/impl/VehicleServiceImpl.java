/*VehicleService.java
  class for the VehicleService
  Author: Zintle Zothe (216130565)
  Date: August 2022
 */
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Vehicle;
import za.ac.cput.repository.VehicleRepository;
import za.ac.cput.service.VehicleService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository repository;

    public VehicleServiceImpl(VehicleRepository repository){
        this.repository=repository;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return this.repository.save(vehicle);
    }

    @Override
    public Vehicle read(String vehicleNumberPlate)
    {
        return this.repository.findById(vehicleNumberPlate).orElse(null);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        if (this.repository.existsById(vehicle.getVehicleNumberPlate()))
      //  if (this.repository.existsById(vehicle.getUserID()))
            return this.repository.save(vehicle);
        return null;
    }

    @Override
    public boolean delete(String vehicleNumberPlate) {
        this.repository.deleteById(vehicleNumberPlate);
        if (this.repository.existsById(vehicleNumberPlate))
            return false;
        else
            return true;
    }

    @Override
    public List<Vehicle> getAll(){
        return this.repository.findAll();
    }

    @Override
    public List<Vehicle> getVehicleGivenUserId(String userID) {
     // return this.repository.getVehicleGivenUserId(userID);
        List<Vehicle> vehiclesGivenUserId= new ArrayList<>();
        List<Vehicle> vehicles=getAll();

                for(Vehicle vehicle: vehicles){
                    if (vehicle.getUserID().equals(userID)) {
                        vehiclesGivenUserId.add(vehicle);
                        System.out.println(vehicle.getVehicleNumberPlate());
                    }
                }
               return vehiclesGivenUserId;
    }

}
