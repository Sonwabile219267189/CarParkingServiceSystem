/* CarParkingServiceSystem.java
 Factory for the Reservation class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 10 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Reservation;
import za.ac.cput.helper.GenerateID;

public class ReservationFactory {

    public static Reservation build(String userName, String dateOfReservation){
        String reservationID = GenerateID.generateUUID();
        String parkingLotID = GenerateID.generateUUID();
        String parkingSpaceID = GenerateID.generateUUID();
        String scheduleID = GenerateID.generateUUID();
        String vehicleID = GenerateID.generateUUID();
        String userID = GenerateID.generateUUID();
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