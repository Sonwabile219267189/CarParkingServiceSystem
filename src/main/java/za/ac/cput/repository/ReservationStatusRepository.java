/* CarParkingServiceSystem.java
 Repository for Reservation Status Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 10 April 2022

package za.ac.cput.repository;

import za.ac.cput.entity.ReservationStatus;
import java.util.ArrayList;
import java.util.List;

public class ReservationStatusRepository implements IReservationStatusRepository{


    private List<ReservationStatus> reservationStatusList;
    private static ReservationStatusRepository reservationStatusRepository;

    public ReservationStatusRepository(){
        this.reservationStatusList= new ArrayList<>();
    }

    public static ReservationStatusRepository getRepsoitory(){
        if(reservationStatusRepository == null)
            reservationStatusRepository = new ReservationStatusRepository();
        return reservationStatusRepository;
    }

    @Override
    public ReservationStatus create(ReservationStatus reservationStatus){
        boolean created = reservationStatusList.add(reservationStatus);
        if(!created)
            return null;
        else return reservationStatus;
    }

    @Override
    public ReservationStatus read(String reservationStatusID){
      ReservationStatus reservationStatus = this.reservationStatusList.stream()
              .filter(g -> g.getReservationStatusID().equals(reservationStatusID))
              .findAny()
              .orElse(null);
      return reservationStatus;
    }

    @Override
    public ReservationStatus update(ReservationStatus reservationStatus){
        ReservationStatus reservationStatus1 = read(reservationStatus.getReservationStatusID());
        if(reservationStatus1!= null){
            reservationStatusList.remove(reservationStatus1);
            reservationStatusList.add(reservationStatus1);
        }
        return reservationStatus1;
    }

    @Override
    public boolean delete(String reservationStatusID){
        ReservationStatus reservationStatus = read(reservationStatusID);
        if(reservationStatusID!=null){
            this.reservationStatusList.remove((reservationStatus));
        }
        return true;
    }

    @Override
    public List<ReservationStatus> getAll() {
        return reservationStatusList;
    }
}

 */
