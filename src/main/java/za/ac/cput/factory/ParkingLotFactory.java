/**
 * ParkingLotFactory.java
 * Factory for ParkingLot
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 5 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.ParkingLot;

public class ParkingLotFactory {

    public static ParkingLot build(String parkingLotID, String parkingLotName, String parkingLotNumber){
        return new ParkingLot.Builder()
                .setParkingLotID(parkingLotID)
                .setParkingLotName(parkingLotName)
                .setParkingLotNumber(parkingLotNumber)
                .build();
    }
}
