/* CarParkingServiceSystem.java
 Factory for the Reservation class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 9 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Reservation;
import za.ac.cput.util.Helper;

public class ReservationFactory {

    public static Reservation build(String userName, String dateOfReservation){
        String reservationID = Helper.generateUUID();
        String parkingLotID = Helper.generateUUID();
        String parkingSpaceID = Helper.generateUUID();
        String scheduleID = Helper.generateUUID();
        String vehicleID = Helper.generateUUID();
        String userID = Helper.generateUUID();
        return new Reservation.Builder()
                .setReservationID(reservationID)
                .setParkingLotID(parkingLotID)
                .setParkingSpaceID(parkingSpaceID)
                .setScheduleID(scheduleID)
                .setVehicleID(vehicleID)
                .setUserName(userName)
                .setDateOfReservation(dateOfReservation)
                .setUserID(userID)
                .build();
    }
}