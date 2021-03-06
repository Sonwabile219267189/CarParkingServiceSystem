/* CarParkingServiceSystem.java
 Factory for the Reservation Status class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 9 April 2022
 */

package za.ac.cput.factory;

import za.ac.cput.entity.ReservationStatus;
import za.ac.cput.helper.GenerateID;
import za.ac.cput.entity.Reservation;

public class ReservationStatusFactory {

    public static ReservationStatus build(String complete){
        String reservationID = GenerateID.generateUUID();
        return new ReservationStatus.Builder()
                .setReservationID(reservationID)
                .setComplete(complete)
                .build();
    }
}