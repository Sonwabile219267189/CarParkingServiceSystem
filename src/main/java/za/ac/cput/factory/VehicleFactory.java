package za.ac.cput.factory;
/*VehicleFactory.java
  Factory class for the Vehicle
  Author: Zintle Zothe (216130565)
  Date: 07 April 2022
 */
import za.ac.cput.entity.Vehicle;
import za.ac.cput.helper.GenerateID;


public class VehicleFactory {
    public static Vehicle createVehicle(String vehiclePlateNumber, String vehicleType, String vehicleModel, String vehicleColour){

        String id= GenerateID.generateUUID();

        Vehicle vehicle = new Vehicle.Builder().setVehicleId(id)
                .setVehiclePlateNumber(vehiclePlateNumber)
                .setVehicleType(vehicleType)
                .setVehicleModel(vehicleModel)
                .setVehicleColour(vehicleColour)
                .build();
        return vehicle;
    }
}
