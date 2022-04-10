/**
 * ParkingLotRepository.java
 * Repository for ParkingLot
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotRepository implements IParkingLotRepository{

    public static ParkingLotRepository repository = null;
    private List<ParkingLot> parkingLotDB = null;

    //singleton
    private ParkingLotRepository(){
        parkingLotDB = new ArrayList<>();

    }

    public static ParkingLotRepository getRepository(){
        if (repository == null){
            repository = new ParkingLotRepository();
        }
        return repository;
    }

    @Override
    public ParkingLot create(ParkingLot parkingLot) {
        parkingLotDB.add(parkingLot);
        return parkingLot;
    }

    @Override
    public ParkingLot read(String parkingLotID) {
        for(ParkingLot parkingLot : parkingLotDB){
            if(parkingLot.getParkingLotID().equals(parkingLotID)){
                return parkingLot;
            }
        }
        return null;
    }

    @Override
    public ParkingLot update(ParkingLot parkingLot) {
        ParkingLot oldParkingLot = repository.read(parkingLot.getParkingLotID());
        if(oldParkingLot != null){
            parkingLotDB.remove(oldParkingLot);
            parkingLotDB.add(parkingLot);
            return parkingLot;
        }
        return null;
    }

    @Override
    public boolean delete(String parkingLotID) {
        ParkingLot parkingLotDelete = read(parkingLotID);
        if(parkingLotDelete == null){
            return false;
        }
        parkingLotDB.remove(parkingLotDelete);
        return true;
    }

    @Override
    public List<ParkingLot> getAll() {
        return parkingLotDB;
    }
}
