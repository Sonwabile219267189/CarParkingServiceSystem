/**
 * IParkingLotRepository.java
 * Interface for ParkingLotRepository
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.ParkingLot;
import java.util.List;

public interface IParkingLotRepository extends IRepository<ParkingLot,String>{

    public List<ParkingLot> getAll();
}
