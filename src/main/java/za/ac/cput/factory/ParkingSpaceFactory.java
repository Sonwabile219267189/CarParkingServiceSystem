/**
 * ParkingSpaceFactory.java
 * Factory for ParkingSpace
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 6 August 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.ParkingSpace;
import za.ac.cput.util.Helper;

public class ParkingSpaceFactory {
    public static ParkingSpace build( String parkingSpaceNumber, String parkingLotID, boolean isEmpty){
        String parkingSpaceID = Helper.generateUUID();
        return new ParkingSpace.Builder()
                .setParkingSpaceID(parkingSpaceID)
                .setParkingSpaceNumber(parkingSpaceNumber)
                .setParkingLotID(parkingLotID)
                .setIsEmpty(isEmpty)
                .build();
    }
}
