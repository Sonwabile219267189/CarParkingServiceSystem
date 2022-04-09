package za.ac.cput.factory.helper;
/** GenerateID.java
 * Class to generate ID. To be used in other classes.
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 8 April 2022
 */
import java.util.UUID;

public class GenerateID {

    public static String generateUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }


}

