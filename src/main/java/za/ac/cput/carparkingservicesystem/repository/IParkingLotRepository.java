/**
 * IParkingLotRepository.java
 * Interface for ParkingLotRepository
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.carparkingservicesystem.repository;

import za.ac.cput.carparkingservicesystem.entity.ParkingLot;
import java.util.List;

public interface IParkingLotRepository extends IRepository<ParkingLot,String>{

    public List<ParkingLot> getAll();
}
