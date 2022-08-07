package za.ac.cput.repository;

/*VehicleRepository.java
  Repository for the vehicle
  Author: Zintle Zothe (216130565)
  Date: 08 April 2022
 */

import za.ac.cput.entity.Vehicle;
import java.util.HashSet;
import java.util.Set;

public class VehicleRepository implements IVehicleRepository {
    private static VehicleRepository repository =null;
    private Set<Vehicle> vehicleDB=null;


    private VehicleRepository(){
        vehicleDB =new HashSet<Vehicle>();
    }


    public static VehicleRepository getRepository(){
        if(repository==null){
            repository=new VehicleRepository();
        }
        return repository;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        boolean created=vehicleDB.add(vehicle);
        if(!created)
            return null;
        else
            return vehicle;
    }

    @Override
    public Vehicle read(String vehicleNumberPlate) {
        // reading using lambda expressions
        Vehicle vehicle=this.vehicleDB.stream()
               .filter(a ->a.getVehicleNumberPlate().equals(vehicleNumberPlate))
                .findAny()
                .orElse(null);

        return vehicle;

    }

//    @Override
//    public Vehicle update(Vehicle vehicle) {
//        Vehicle oldVehicle=read(vehicle.getVehicleNumberPlate());
//        if(oldVehicle != null){
//            vehicleDB.remove(oldVehicle);
//            vehicleDB.add(vehicle);
//            return vehicle;
//
//        }
//        return null;
//    }

        @Override
    public Vehicle update(Vehicle vehicle) {
        Vehicle oldVehicle=read(vehicle.getUserId());
        if(oldVehicle != null){
            vehicleDB.remove(oldVehicle);
            vehicleDB.add(vehicle);
            return vehicle;

        }
        return null;
    }


    @Override
    public boolean delete(String vehicleNumberPlate) {
        Vehicle vehicleToDelete= read(vehicleNumberPlate);
        if(vehicleToDelete== null)
            return false;
        vehicleDB.remove(vehicleToDelete);
        return true;
    }

    @Override
    public Set<Vehicle> getAll() {
        return vehicleDB;
    }


}
