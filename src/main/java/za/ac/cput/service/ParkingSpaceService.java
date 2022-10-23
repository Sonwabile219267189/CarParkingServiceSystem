/**
 * ParkingSpaceServive.java
 * Interface for ParkingSpace.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 11 August 2022
 */
package za.ac.cput.service;

import za.ac.cput.entity.ParkingSpace;

import java.util.List;

public interface ParkingSpaceService extends IService<ParkingSpace, String>{
    public List<ParkingSpace> findAll();

    public ParkingSpace bookEmptySpaceIfEmpty(String s);
}
