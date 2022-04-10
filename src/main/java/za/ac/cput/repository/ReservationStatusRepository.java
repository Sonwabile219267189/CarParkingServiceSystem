/* CarParkingServiceSystem.java
 Repository for Reservation Status Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 10 April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.ReservationStatus;
import za.ac.cput.factory.ReservationStatusFactory;

import java.util.HashSet;
import java.util.Set;

public class ReservationStatusRepository {


    private Set<ReservationStatus> reservationStatusDB;

    public ReservationStatusRepository(){
        this.reservationStatusDB= new HashSet<>();
    }

    public ReservationStatus create(String complete){
        ReservationStatus reservationStatus = ReservationStatusFactory.build(complete);
        this.reservationStatusDB.add(reservationStatus);
        return reservationStatus;
    }
    public ReservationStatus read(String reservationID){
        ReservationStatus reservationStatus = null;
        for(ReservationStatus rs : reservationStatusDB){
            if(rs.getReservationID().equalsIgnoreCase(reservationID)){
                reservationStatus = rs;
                break;
            }
        }
        return reservationStatus;
    }
    public ReservationStatus update(ReservationStatus reservationStatus){
        ReservationStatus reservationStatus1 = read(reservationStatus.getReservationID());
        if(reservationStatus1!= null){
            reservationStatusDB.remove(reservationStatus1);
            reservationStatusDB.add(reservationStatus1);
        }
        return reservationStatus1;
    }
    public ReservationStatus delete(String reservationID){
        ReservationStatus reservationStatus = read(reservationID);
        if(reservationID!=null){
            this.reservationStatusDB.remove((reservationStatus));
        }
        return null;
    }
}