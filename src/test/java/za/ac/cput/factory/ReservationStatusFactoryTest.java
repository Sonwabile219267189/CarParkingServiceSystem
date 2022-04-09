/* CarParkingServiceSystem.java
 Factory test for the Reservation status class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 9 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.ReservationStatus;

public class ReservationStatusFactoryTest {

    ReservationStatus reservationStatus = ReservationStatusFactory.build("reserved");

    @Test
    public void ReservationStatusTest(){
        Assertions.assertEquals(reservationStatus, reservationStatus);
        Assertions.assertSame(reservationStatus,reservationStatus);
    }

    @Test
    @Disabled
    public void disableTest(){
        Assertions.assertEquals(reservationStatus, reservationStatus);
    }

    @Test
    @Timeout(value = 1000)
    public void testTimeout(){
        Assertions.assertEquals(reservationStatus, reservationStatus);
    }
}