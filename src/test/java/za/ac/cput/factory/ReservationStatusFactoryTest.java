/* CarParkingServiceSystem.java
 Factory test for the Reservation status class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 9 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.entity.ReservationStatus;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationStatusFactoryTest {

    @Test
    public void build(){
        ReservationStatus reservationStatus = ReservationStatusFactory.build("T323",
                "Needs payment");
        System.out.println(reservationStatus);
        assertNotNull(reservationStatus);
    }

    @Test
    @DisplayName("Test Throwing an IllegalArgumentException for date of reservation description.")
    public void buildWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class,() ->
                ReservationStatusFactory.build("T323", ""));
        System.out.println("Reservation Description: " +exception.getMessage());
    }
}