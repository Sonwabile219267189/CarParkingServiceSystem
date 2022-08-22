/* CarParkingServiceSystem.java
        Factory test for the Reservation class

Author: Siyamtanda Tonjeni (217107958)
        Date: 9 April 2022
        */
package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.entity.Reservation;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationFactoryTest {

    @Test
    public void build(){
        Reservation reservation = ReservationFactory.build("T453","L1",
                "07 May 2022",ReservationStatusFactory.build("T323",
                        "Needs payment"));
        System.out.println(reservation);
        assertNotNull(reservation);
    }


    @Test
    @DisplayName("Test Throwing an IllegalArgumentException for date of reservation.")
    public void buildWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ReservationFactory.build("T453","L1","",
                        ReservationStatusFactory.build("T323",
                                "Needs payment")));
        System.out.println("Date of reservation: "+ exception.getMessage());

    }

}