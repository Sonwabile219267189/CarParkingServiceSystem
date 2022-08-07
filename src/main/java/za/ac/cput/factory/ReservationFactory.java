/* CarParkingServiceSystem.java
 Factory for the Reservation class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 9 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Reservation;
import za.ac.cput.entity.ReservationStatus;
import za.ac.cput.util.Helper;

public class ReservationFactory {

    public static Reservation build(String reservationID, String parkingSpaceID, String dateOfReservation,
                                    ReservationStatus reservationStatus){
        reservationID = Helper.generateUUID();
        parkingSpaceID = Helper.generateUUID();
        Helper.isEmptyOrNull(dateOfReservation);
        return new Reservation.Builder()
                .setReservationID(reservationID)
                .setParkingSpaceID(parkingSpaceID)
                .setDateOfReservation(dateOfReservation)
                .setReservationStatus(reservationStatus)
                .build();
    }
}