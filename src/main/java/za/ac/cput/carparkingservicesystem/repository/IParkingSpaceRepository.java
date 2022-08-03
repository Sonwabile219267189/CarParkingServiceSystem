/**
 * IParkingSpaceRepository.java
 * Interface for ParkingSpace.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.carparkingservicesystem.repository;

import za.ac.cput.carparkingservicesystem.entity.ParkingSpace;
import java.util.List;

public interface IParkingSpaceRepository extends IRepository<ParkingSpace, String>{

    public List<ParkingSpace> getAll();
}
