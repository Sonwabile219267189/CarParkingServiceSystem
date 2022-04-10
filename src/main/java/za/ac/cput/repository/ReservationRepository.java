/* CarParkingServiceSystem.java
 Repository for Reservation Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 10 April 2022
 */

package za.ac.cput.repository;

import za.ac.cput.entity.Reservation;
import za.ac.cput.factory.ReservationFactory;

import java.util.HashSet;
import java.util.Set;

public class ReservationRepository {

    private Set<Reservation> reservationDB;

    public ReservationRepository(){
        this.reservationDB= new HashSet<>();
    }

    public Reservation create(String userName, String dateOfReservation){
        Reservation reservation = ReservationFactory.build(userName,dateOfReservation);
        this.reservationDB.add(reservation);
        return reservation;
    }
    public Reservation read(String reservationID){
        Reservation reservation = null;
        for(Reservation r : reservationDB){
            if(r.getReservationID().equalsIgnoreCase(reservationID)){
                reservation = r;
                break;
            }
        }
        return reservation;
    }
    public Reservation update(Reservation reservation){
        Reservation reservation1 = read(reservation.getReservationID());
        if(reservation1!= null){
            reservationDB.remove(reservation1);
            reservationDB.add(reservation1);
        }
        return reservation1;
    }
    public Reservation delete(String reservationID){
        Reservation reservation = read(reservationID);
        if(reservationID!=null){
            this.reservationDB.remove((reservation));
        }
        return null;
    }
}