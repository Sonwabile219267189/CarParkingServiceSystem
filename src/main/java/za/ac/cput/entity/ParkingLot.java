/**
 * ParkingLot.java
 * Entity for ParkingLot
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 6 August 2022
 */
package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ParkingLot implements Serializable {
    @Id private String parkingLotID;
    private String campusName;
    //private String parkingLotName;
    private String parkingLotNumber;

    public ParkingLot(){}

//    public String getParkingLotName() {
//        return parkingLotName;
//    }

    public String getParkingLotNumber() {
        return parkingLotNumber;
    }

    public String getParkingLotID(){
        return this.parkingLotID;
    }

    public String getCampusName(){return this.campusName;}

    private ParkingLot(Builder builder){
        this.parkingLotID = builder.parkingLotID;
        this.campusName = builder.campusName;
        //this.parkingLotName = builder.parkingLotName;
        this.parkingLotNumber = builder.parkingLotNumber;

    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "parkingLotID='" + parkingLotID + '\'' +
                ", campusName='" + campusName + '\'' +
                ", parkingLotNumber='" + parkingLotNumber + '\'' +
                '}';
    }

    //builder section

    public static class Builder{
        private String parkingLotID;
        private String campusName;
        //private String parkingLotName;
        private String parkingLotNumber;

        public Builder setParkingLotID(String parkingLotID){
            this.parkingLotID = parkingLotID;
            return this;
        }

        public Builder setCampusName(String campusName){
            this.campusName = campusName;
            return this;
        }

//        public Builder setParkingLotName(String parkingLotName){
//            this.parkingLotName = parkingLotName;
//            return this;
//        }

        public Builder setParkingLotNumber(String parkingLotNumber){
            this.parkingLotNumber = parkingLotNumber;
            return this;
        }

        public Builder copy(ParkingLot parkingLot){
            this.parkingLotID = parkingLot.parkingLotID;
            this.campusName = parkingLot.campusName;
            //this.parkingLotName = parkingLot.parkingLotName;
            this.parkingLotNumber = parkingLot.parkingLotNumber;
            return this;

        }

        public ParkingLot build(){
            return new ParkingLot(this);
        }

    }
}
