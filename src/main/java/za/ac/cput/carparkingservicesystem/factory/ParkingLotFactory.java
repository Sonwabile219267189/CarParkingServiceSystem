/**
 * ParkingLotFactory.java
 * Factory for ParkingLot
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 5 April 2022
 */
package za.ac.cput.carparkingservicesystem.factory;

import za.ac.cput.carparkingservicesystem.entity.ParkingLot;
import za.ac.cput.carparkingservicesystem.helper.GenerateID;

public class ParkingLotFactory {

    public static ParkingLot build(String parkingLotName, String parkingLotNumber){
        String parkingLotID = GenerateID.generateUUID();
        return new ParkingLot.Builder()
                .setParkingLotID(parkingLotID)
                .setParkingLotName(parkingLotName)
                .setParkingLotNumber(parkingLotNumber)
                .build();
    }
}
