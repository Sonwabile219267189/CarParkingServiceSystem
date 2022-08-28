package za.ac.cput.factory;
/*VehicleFactory.java
  Factory class for the Vehicle
  Author: Zintle Zothe (216130565)
  Date: 07 April 2022
 */
import za.ac.cput.entity.Vehicle;
import za.ac.cput.util.Helper;


public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleNumberPlate,String userID ,String vehicleModel, String vehicleColour){

        Helper.isEmptyOrNull(vehicleNumberPlate);
        Helper.isEmptyOrNull(vehicleModel);
        Helper.isEmptyOrNull(vehicleColour);


        Vehicle vehicle = new Vehicle.Builder()
                .setVehicleNumberPlate(vehicleNumberPlate)
                .setUserID(userID)
                .setVehicleModel(vehicleModel)
                .setVehicleColour(vehicleColour)
                .build();
        return vehicle;
    }
}
