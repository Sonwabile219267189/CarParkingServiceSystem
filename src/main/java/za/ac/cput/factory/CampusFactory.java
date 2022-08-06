/**
 * CampusFactory.java
 * Factory for Campus
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 5 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Campus;
import za.ac.cput.util.Helper;
@Deprecated
public class CampusFactory {

    public static Campus build( String campusName, String campusLocation){
        String campusID = Helper.generateUUID();
        return new Campus.Builder()
                .setCampusID(campusID)
                .setCampusName(campusName)
                .setCampusLocation(campusLocation)
                .build();
    }
}
