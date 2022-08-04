package za.ac.cput.entity;

/*Vehicle.java
  Entity for the Vehicle
  Author: Zintle Zothe (216130565)
  Date: 07 April 2022
 */

public class Vehicle {

    private String vehicleId;
    private String vehiclePlateNumber;
    private String vehicleType;
    private String vehicleModel;
    private String vehicleColour;

    //
    private Vehicle(){
    }


   //
    private Vehicle(Builder builder){
        this.vehicleId=builder.vehicleId;
        this.vehiclePlateNumber=builder.vehiclePlateNumber;
        this.vehicleType=builder.vehicleType;
        this.vehicleModel=builder.vehicleModel;
        this.vehicleColour=builder.vehicleColour;

    }

    //
    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getVehicleColour() {
        return vehicleColour;
    }

    //
    public static class Builder{
        private String vehicleId;
        private String vehiclePlateNumber;
        private String vehicleType;
        private String vehicleModel;
        private String vehicleColour;

        public Builder setVehicleId(String vehicleId){
            this.vehicleId=vehicleId;
            return this;
        }

        public Builder setVehiclePlateNumber(String vehiclePlateNumber){
            this.vehiclePlateNumber=vehiclePlateNumber;
            return this;
        }

        public Builder setVehicleType(String vehicleType){
            this.vehicleType=vehicleType;
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
            this.vehicleId=vehicle.vehicleId;
            this.vehiclePlateNumber=vehicle.vehiclePlateNumber;
            this.vehicleType=vehicle.vehicleType;
            this.vehicleModel=vehicle.vehicleModel;
            this.vehicleColour=vehicle.vehicleColour;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", vehiclePlateNumber='" + vehiclePlateNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleColour='" + vehicleColour + '\'' +
                '}';
    }
}

