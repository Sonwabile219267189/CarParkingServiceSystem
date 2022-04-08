/**
 * ParkingSpaceFactory.java
 * Factory for ParkingSpace
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 5 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.ParkingLot;
import za.ac.cput.entity.ParkingSpace;

public class ParkingSpaceFactory {
    public static ParkingSpace build(String parkingSpaceID, String parkingSpaceNumber, String parkingLotID){
        return new ParkingSpace.Builder()
                .setParkingSpaceID(parkingSpaceID)
                .setParkingSpaceNumber(parkingSpaceNumber)
                .setParkingLotID(parkingLotID)
                .build();
    }
}
