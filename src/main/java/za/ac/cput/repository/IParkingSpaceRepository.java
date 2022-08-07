/**
 * IParkingSpaceRepository.java
 * Interface for ParkingSpace.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.ParkingSpace;
import java.util.List;
@Repository
public interface IParkingSpaceRepository extends JpaRepository<ParkingSpace, String> {

    //public List<ParkingSpace> getAll();
}
