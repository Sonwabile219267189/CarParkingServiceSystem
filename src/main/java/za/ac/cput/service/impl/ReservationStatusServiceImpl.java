package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.ReservationStatus;
import za.ac.cput.repository.IReservationStatusRepository;
import za.ac.cput.service.ReservationStatusService;

import java.util.List;

public class ReservationStatusServiceImpl implements ReservationStatusService {
    @Autowired
    private IReservationStatusRepository repository;
    //private static ReservationService SERVICE;

    private ReservationStatusServiceImpl(IReservationStatusRepository repositoryStatus){
        this.repository = repositoryStatus;
    }

    @Override
    public ReservationStatus create(ReservationStatus reservationStatus){
        return this.repository.save(reservationStatus);
    }

    @Override
    public ReservationStatus read(String reservationStatus){
        return this.repository.findById(reservationStatus).orElse(null);
    }

    @Override
    public ReservationStatus update(ReservationStatus reservationStatus) {

        if(this.repository.existsById(reservationStatus.getReservationStatusID())){
            return this.repository.save(reservationStatus);
        }
        return null;
    }

    public boolean delete(String reservationStatusID){
        if(this.repository.existsById(reservationStatusID)) {
            this.repository.deleteById(reservationStatusID);
            return true;
        }
        return false;
    }

    public List<ReservationStatus> findAll(){
        return this.repository.findAll();
    }
}
