/* CarParkingServiceSystem.java
    Interface Repository for the Reservation Class.
    Author: Siyamtanda Tonjeni (217107958)
    Date: 10 April 2022
 */

package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.Reservation;
import java.util.List;

public interface IReservationRepository extends JpaRepository<Reservation, String> {

}

