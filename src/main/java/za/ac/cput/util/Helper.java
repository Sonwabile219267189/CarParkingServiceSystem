/**
 * GenerateID.java
 * Class to generate ID. To be used in other classes.
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 8 April 2022
 */
package za.ac.cput.util;
import java.util.UUID;

public class Helper {

    public static String generateUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static boolean isEmptyOrNull(String s) {
        if(s.equals("")) {
            throw new IllegalArgumentException(" Please fill in the required field");
        }
        return false;
    }

}
