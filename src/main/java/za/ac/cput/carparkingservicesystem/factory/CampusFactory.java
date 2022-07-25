/**
 * CampusFactory.java
 * Factory for Campus
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 5 April 2022
 */
package za.ac.cput.carparkingservicesystem.factory;

import za.ac.cput.carparkingservicesystem.entity.Campus;
import za.ac.cput.carparkingservicesystem.helper.GenerateID;

public class CampusFactory {

    public static Campus build(String campusName, String campusLocation){
        String campusID = GenerateID.generateUUID();
        return new Campus.Builder()
                .setCampusID(campusID)
                .setCampusName(campusName)
                .setCampusLocation(campusLocation)
                .build();
    }
}
