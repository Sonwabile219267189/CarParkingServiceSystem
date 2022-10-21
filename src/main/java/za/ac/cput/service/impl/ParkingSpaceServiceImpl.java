/**
 * ParkingSpaceServiveImpl.java
 * Implementation class for ParkingSpaceService.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 11 August 2022
 */
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.ParkingSpace;
import za.ac.cput.factory.ParkingSpaceFactory;
import za.ac.cput.repository.ParkingSpaceRepository;
import za.ac.cput.service.ParkingSpaceService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingSpaceServiceImpl implements ParkingSpaceService {

    @Autowired private ParkingSpaceRepository repository;

    public ParkingSpaceServiceImpl(ParkingSpaceRepository repository){
        this.repository = repository;
    }
    @Override
    public ParkingSpace create(ParkingSpace parkingSpace) {
        return this.repository.save(parkingSpace);
    }

    @Override
    public ParkingSpace read(String s) {
        return this.repository.findById(s).orElse(null);
    }

    @Override
    public ParkingSpace update(ParkingSpace parkingSpace) {

        if(this.repository.existsById(parkingSpace.getParkingSpaceID())){
            return this.repository.save(parkingSpace);
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        if(this.repository.existsById(s)){
            this.repository.deleteById(s);
            return true;
        }
        return false;
    }

    @Override
    public List<ParkingSpace> findAll(){
        return this.repository.findAll();
    }

    @Override
    public ParkingSpace bookEmptySpaceIfEmpty(String id){
        ParkingSpace ps = this.read(id);
        ParkingSpace update = null;
        if(ps.getIsEmpty() == true) {
            update = new ParkingSpace.Builder().copy(ps).setIsEmpty(false).build();
            this.repository.save(update);
        }else{
            System.out.println("This space is booked.");
        }
        return update;
    }


}
