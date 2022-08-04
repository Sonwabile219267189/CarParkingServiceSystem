/**
 * ParkingSpaceRepository.java
 * Repository for ParkingSpace
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.ParkingLot;
import za.ac.cput.entity.ParkingSpace;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpaceRepository implements IParkingSpaceRepository{

    public static ParkingSpaceRepository repository = null;
    private List<ParkingSpace> parkingSpaceDB = null;

    //singleton

    private ParkingSpaceRepository(){
        parkingSpaceDB = new ArrayList<>();
    }

    public static ParkingSpaceRepository getRepository(){
        if (repository == null){
            repository = new ParkingSpaceRepository();
        }
        return repository;
    }

    @Override
    public ParkingSpace create(ParkingSpace parkingSpace) {
        parkingSpaceDB.add(parkingSpace);
        return parkingSpace;
    }

    @Override
    public ParkingSpace read(String parkingSpaceID) {
        for(ParkingSpace ps: parkingSpaceDB){
            if(ps.getParkingSpaceID().equals(parkingSpaceID)){
                return ps;
            }
        }
        return null;
    }

    @Override
    public ParkingSpace update(ParkingSpace parkingSpace) {
        ParkingSpace oldParkingSpace = repository.read(parkingSpace.getParkingSpaceID());
        if(oldParkingSpace != null){
            parkingSpaceDB.remove(oldParkingSpace);
            parkingSpaceDB.add(parkingSpace);
            return parkingSpace;
        }
        return null;
    }

    @Override
    public boolean delete(String parkingSpaceID) {
        ParkingSpace parkingSpaceDelete = read(parkingSpaceID);
        if(parkingSpaceDelete == null){
            return false;
        }
        parkingSpaceDB.remove(parkingSpaceDelete);
        return true;

    }

    @Override
    public List<ParkingSpace> getAll() {
        return parkingSpaceDB;
    }
}
