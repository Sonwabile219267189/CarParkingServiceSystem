/* CarParkingServiceSystem.java
 Service for a Reservation Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 12 August 2022
 */
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Reservation;
import za.ac.cput.repository.IReservationRepository;
import za.ac.cput.service.ReservationService;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired private IReservationRepository repository;
    //private static ReservationService SERVICE;

    private ReservationServiceImpl(IReservationRepository repository){
        this.repository = repository;
    }

    @Override
    public Reservation create(Reservation reservation){
        return this.repository.save(reservation);
    }

    @Override
    public Reservation read(String reservation){
        return this.repository.findById(reservation).orElse(null);
    }

    @Override
    public Reservation update(Reservation reservation) {

        if(this.repository.existsById(reservation.getReservationID())){
            return this.repository.save(reservation);
        }
        return null;
    }

    public boolean delete(String reservationID){
        if(this.repository.existsById(reservationID)) {
            this.repository.deleteById(reservationID);
            return true;
        }
        return false;
    }

    public List<Reservation> findAll(){
        return this.repository.findAll();
    }
}
