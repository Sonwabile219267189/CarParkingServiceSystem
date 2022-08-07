/**
 * IParkingLotRepository.java
 * Interface for ParkingLotRepository
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.ParkingLot;
import java.util.List;
@Repository
public interface IParkingLotRepository extends JpaRepository<ParkingLot,String> {

    //public List<ParkingLot> getAll();
}
