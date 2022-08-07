/**
 * IParkingSpaceRepository.java
 * Interface for ParkingSpace.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 7 August 2022
 */
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.ParkingSpace;

@Repository
public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, String> {

    //public List<ParkingSpace> getAll();
}
