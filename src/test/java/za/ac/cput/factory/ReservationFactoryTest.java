/* CarParkingServiceSystem.java
        Factory test for the Reservation class

Author: Siyamtanda Tonjeni (217107958)
        Date: 10 April 2022
        */
package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.Reservation;

public class ReservationFactoryTest {


    Reservation reservation = ReservationFactory.build("John","8/03/2022");

    @Test
    public void genderTes(){
        Assertions.assertEquals(reservation, reservation);
        Assertions.assertSame(reservation,reservation);
    }

    @Test
    @Disabled
    public void disableTest(){
        Assertions.assertEquals(reservation, reservation);
    }

    @Test
    @Timeout(value = 1000)
    public void testTimeout(){
        Assertions.assertEquals(reservation, reservation);
    }
}