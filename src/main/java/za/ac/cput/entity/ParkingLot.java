/**
 * ParkingLot.java
 * Entity for ParkingLot
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 5 April 2022
 */
package za.ac.cput.entity;

public class ParkingLot {
    private String parkingLotID;
    private String parkingLotName;
    private String parkingLotNumber;

    public String getParkingLotName() {
        return parkingLotName;
    }

    public String getParkingLotNumber() {
        return parkingLotNumber;
    }

    public String getParkingLotID(){
        return this.parkingLotID;
    }

    private ParkingLot(Builder builder){
        this.parkingLotID = builder.parkingLotID;
        this.parkingLotName = builder.parkingLotName;
        this.parkingLotNumber = builder.parkingLotNumber;

    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "parkingLotID='" + parkingLotID + '\'' +
                ", parkingLotName='" + parkingLotName + '\'' +
                ", parkingLotNumber='" + parkingLotNumber + '\'' +
                '}';
    }

    //builder section

    public static class Builder{
        private String parkingLotID;
        private String parkingLotName;
        private String parkingLotNumber;

        public Builder setParkingLotID(String parkingLotID){
            this.parkingLotID = parkingLotID;
            return this;
        }

        public Builder setParkingLotName(String parkingLotName){
            this.parkingLotName = parkingLotName;
            return this;
        }

        public Builder setParkingLotNumber(String parkingLotNumber){
            this.parkingLotNumber = parkingLotNumber;
            return this;
        }

        public Builder copy(ParkingLot parkingLot){
            this.parkingLotID = parkingLot.parkingLotID;
            this.parkingLotName = parkingLot.parkingLotName;
            this.parkingLotNumber = parkingLot.parkingLotNumber;
            return this;

        }

        public ParkingLot build(){
            return new ParkingLot(this);
        }

    }
}
