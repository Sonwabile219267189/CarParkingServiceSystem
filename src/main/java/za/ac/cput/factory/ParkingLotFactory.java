/**
 * ParkingLotFactory.java
 * Factory for ParkingLot
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 6 August 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.ParkingLot;
import za.ac.cput.util.Helper;

public class ParkingLotFactory {

    public static ParkingLot build(String campusName, String parkingLotNumber){
        String parkingLotID = Helper.generateUUID();
        return new ParkingLot.Builder()
                .setParkingLotID(parkingLotID)
                .setCampusName(campusName)
                //.setParkingLotName(parkingLotName)
                .setParkingLotNumber(parkingLotNumber)
                .build();
    }
}
