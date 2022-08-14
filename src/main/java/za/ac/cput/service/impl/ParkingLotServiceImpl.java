package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.repository.ParkingLotRepository;
import za.ac.cput.service.ParkingLotService;

import java.util.List;
@Service
public class ParkingLotServiceImpl implements ParkingLotService {

    @Autowired private ParkingLotRepository repository;

    public ParkingLotServiceImpl(ParkingLotRepository repository){
        this.repository = repository;
    }

    @Override
    public ParkingLot create(ParkingLot parkingLot) {
        return this.repository.save(parkingLot);
    }

    @Override
    public ParkingLot read(String s) {
        return this.repository.findById(s).orElse(null);

    }

    @Override
    public ParkingLot update(ParkingLot parkingLot) {

        if(this.repository.existsById(parkingLot.getParkingLotID())){
            return this.repository.save(parkingLot);
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        if(this.repository.existsById(s)) {
            this.repository.deleteById(s);
            return true;
        }
        return false;
    }

    @Override
    public List<ParkingLot> findAll(){
        return this.repository.findAll();
    }
}
