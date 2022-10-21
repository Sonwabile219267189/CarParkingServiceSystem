/**
 * ParkingSpace.java
 * Entity for ParkingSpace
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 6 August 2022
 */
package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ParkingSpace implements Serializable {
    @Id
    private String parkingSpaceID;
    private String parkingSpaceNumber;
    private String parkingLotID;
    private boolean isEmpty;

    protected ParkingSpace(){}

    public String getParkingSpaceID(){
        return parkingSpaceID;
    }

    public String getParkingSpaceNumber(){
        return parkingSpaceNumber;
    }

    public String getParkingLotID(){
        return parkingLotID;
    }

    public boolean getIsEmpty(){return isEmpty;}

    private ParkingSpace(Builder builder){
        this.parkingSpaceID = builder.parkingSpaceID;
        this.parkingSpaceNumber = builder.parkingSpaceNumber;
        this.parkingLotID = builder.parkingLotID;
        this.isEmpty = builder.isEmpty;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "parkingSpaceID='" + parkingSpaceID + '\'' +
                ", parkingSpaceNumber='" + parkingSpaceNumber + '\'' +
                ", parkingLotID='" + parkingLotID + '\'' +
                ", isEmpty=" + isEmpty +
                '}' + '\n';
    }

    //builder Section

    public static class Builder{
        private String parkingSpaceID;
        private String parkingSpaceNumber;
        private String parkingLotID;
        private boolean isEmpty;

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

        public Builder setIsEmpty(boolean isEmpty){
            this.isEmpty = isEmpty;
            return this;
        }

        public Builder copy(ParkingSpace parkingSpace){
            this.parkingSpaceID = parkingSpace.parkingSpaceID;
            this.parkingSpaceNumber = parkingSpace.parkingSpaceNumber;
            this.parkingLotID = parkingSpace.parkingLotID;
            this.isEmpty = parkingSpace.isEmpty;
            return this;

        }

        public ParkingSpace build(){
            return new ParkingSpace(this);
        }
    }
}
