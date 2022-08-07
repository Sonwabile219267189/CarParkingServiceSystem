/**
 * IParkingLotRepository.java
 * Interface for ParkingLotRepository
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 7 August 2022
 */
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.ParkingLot;

@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot,String> {

    //public List<ParkingLot> getAll();
}
