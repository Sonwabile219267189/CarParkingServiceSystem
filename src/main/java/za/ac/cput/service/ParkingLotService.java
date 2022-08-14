package za.ac.cput.service;

import za.ac.cput.entity.ParkingLot;

import java.util.List;

public interface ParkingLotService extends IService<ParkingLot, String> {
    public List<ParkingLot> findAll();
}
