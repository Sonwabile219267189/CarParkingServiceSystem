package za.ac.cput.entity;

/*Vehicle.java
  Entity for the Vehicle
  Author: Zintle Zothe (216130565)
  Date: 07 April 2022
 */

import java.util.Objects;

public class Vehicle {

    private String vehicleNumberPlate;
    private String userId;
    private String vehicleModel;
    private String vehicleColour;

    //
    private Vehicle(){
    }


    //
    private Vehicle(Builder builder){
        this.vehicleNumberPlate=builder.vehicleNumberPlate;
        this.userId=builder.userId;
        this.vehicleModel=builder.vehicleModel;
        this.vehicleColour=builder.vehicleColour;

    }

    //
    public String getVehicleNumberPlate() {
        return vehicleNumberPlate;
    }

    public String getUserId() {
        return userId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getVehicleColour() {
        return vehicleColour;
    }

    //
    public static class Builder{
        private String vehicleNumberPlate;
        private String userId;
        private String vehicleModel;
        private String vehicleColour;


        public Builder setVehicleNumberPlate(String vehicleNumberPlate){
            this.vehicleNumberPlate=vehicleNumberPlate;
            return this;
        }

        public Builder setUserId(String userId){
            this.userId=userId;
            return this;
        }

        public Builder setVehicleModel(String vehicleModel){
            this.vehicleModel=vehicleModel;
            return this;
        }

        public Builder setVehicleColour(String vehicleColour){
            this.vehicleColour=vehicleColour;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }


        public Builder copy(Vehicle vehicle){
            this.vehicleNumberPlate=vehicle.vehicleNumberPlate;
            this.userId=vehicle.userId;
            this.vehicleModel=vehicle.vehicleModel;
            this.vehicleColour=vehicle.vehicleColour;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumberPlate='" + vehicleNumberPlate + '\'' +
                ", userId='" + userId + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleColour='" + vehicleColour + '\'' +
                '}';
    }
}

