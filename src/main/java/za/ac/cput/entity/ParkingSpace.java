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
    private ParkingLot parkingLot;

    public String getParkingSpaceID(){
        return parkingSpaceID;
    }

    public String getParkingSpaceNumber(){
        return parkingSpaceNumber;
    }

    public ParkingLot getParkingLot(){
        return parkingLot;
    }

    private ParkingSpace(Builder builder){
        this.parkingSpaceID = builder.parkingSpaceID;
        this.parkingSpaceNumber = builder.parkingSpaceNumber;
        this.parkingLot = builder.parkingLot;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "parkingSpaceID='" + parkingSpaceID + '\'' +
                ", parkingSpaceNumber='" + parkingSpaceNumber + '\'' +
                ", parkingLot=" + parkingLot +
                '}';
    }

    //builder Section

    public static class Builder{
        private String parkingSpaceID;
        private String parkingSpaceNumber;
        private ParkingLot parkingLot;

        public Builder setParkingSpaceID(String parkingSpaceID){
            this.parkingSpaceID = parkingSpaceID;
            return this;
        }

        public Builder setParkingSpaceNumber(String parkingSpaceNumber){
            this.parkingSpaceNumber = parkingSpaceNumber;
            return this;
        }

        public Builder setParkingLot(ParkingLot parkingLot){
            this.parkingLot = parkingLot;
            return this;
        }

        public Builder copy(ParkingSpace parkingSpace){
            this.parkingSpaceID = parkingSpace.parkingSpaceID;
            this.parkingSpaceNumber = parkingSpace.parkingSpaceNumber;
            this.parkingLot = parkingSpace.parkingLot;
            return this;

        }

        public ParkingSpace build(){
            return new ParkingSpace(this);
        }
    }
}
