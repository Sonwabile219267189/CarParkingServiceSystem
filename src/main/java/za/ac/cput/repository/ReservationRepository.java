/* CarParkingServiceSystem.java
 Repository for Reservation Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 10 April 2022


package za.ac.cput.repository;

import za.ac.cput.entity.Reservation;
import java.util.ArrayList;
import java.util.List;

public class ReservationRepository implements IReservationRepository{

    private final List<Reservation> reservationList;
    private static ReservationRepository reservationRepository;

    public ReservationRepository(){
        this.reservationList= new ArrayList<>();
    }

    public static ReservationRepository getRepository(){
        if(reservationRepository == null)
            reservationRepository = new ReservationRepository();
        return reservationRepository;
    }

    @Override
    public Reservation create(Reservation reservation){
        boolean created = reservationList.add(reservation);
        if(!created)
            return null;
        else return reservation;
    }

    @Override
    public Reservation read(String reservationID){
        Reservation reservation = this.reservationList.stream()
                .filter(g -> g.getReservationID().equals(reservationID))
                .findAny()
                .orElse(null);

        return reservation;
    }

    @Override
    public Reservation update(Reservation reservation){
        Reservation reservation1 = read(reservation.getReservationID());
        if(reservation1!= null){
            reservationList.remove(reservation1);
            reservationList.add(reservation1);
        }
        return reservation1;
    }

    @Override
    public boolean delete(String reservationID){
        Reservation reservation = read(reservationID);
        if(reservationID!=null){
            this.reservationList.remove((reservation));
        }
        return true;
    }

    public List<Reservation> getAll() {
        return reservationList;
    }
}

 */
