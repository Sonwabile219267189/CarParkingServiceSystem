/**
 * CampusFactory.java
 * Factory for Campus
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 5 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Campus;

public class CampusFactory {

    public static Campus build(String campusID, String campusName, String campusLocation){
        return new Campus.Builder()
                .setCampusID(campusID)
                .setCampusName(campusName)
                .setCampusLocation(campusLocation)
                .build();
    }
}
