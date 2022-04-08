/**
 * ParkingSpace.java
 * Entity for ParkingSpace
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 5 April 2022
 */
package za.ac.cput.entity;

public class ParkingSpace {
    private String parkingSpaceID;
    private String parkingSpaceNumber;
    private String parkingLotID;

    public String getParkingSpaceID(){
        return parkingSpaceID;
    }

    public String getParkingSpaceNumber(){
        return parkingSpaceNumber;
    }

    public String getParkingLotID(){
        return parkingLotID;
    }

    private ParkingSpace(Builder builder){
        this.parkingSpaceID = builder.parkingSpaceID;
        this.parkingSpaceNumber = builder.parkingSpaceNumber;
        this.parkingLotID = builder.parkingLotID;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "parkingSpaceID='" + parkingSpaceID + '\'' +
                ", parkingSpaceNumber='" + parkingSpaceNumber + '\'' +
                ", parkingLotID=" + parkingLotID +
                '}';
    }

    //builder Section

    public static class Builder{
        private String parkingSpaceID;
        private String parkingSpaceNumber;
        private String parkingLotID;

        public Builder setParkingSpaceID(String parkingSpaceID){
            this.parkingSpaceID = parkingSpaceID;
            return this;
        }

        public Builder setParkingSpaceNumber(String parkingSpaceNumber){
            this.parkingSpaceNumber = parkingSpaceNumber;
            return this;
        }

        public Builder setParkingLotID(String parkingLotID){
            this.parkingLotID = parkingLotID;
            return this;
        }

        public Builder copy(ParkingSpace parkingSpace){
            this.parkingSpaceID = parkingSpace.parkingSpaceID;
            this.parkingSpaceNumber = parkingSpace.parkingSpaceNumber;
            this.parkingLotID = parkingSpace.parkingLotID;
            return this;

        }

        public ParkingSpace build(){
            return new ParkingSpace(this);
        }
    }
}
