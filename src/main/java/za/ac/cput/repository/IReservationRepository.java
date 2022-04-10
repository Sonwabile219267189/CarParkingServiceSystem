/* CarParkingServiceSystem.java
    Interface Repository for the Reservation Class.
    Author: Siyamtanda Tonjeni (217107958)
    Date: 10 April 2022
 */

package za.ac.cput.repository;

import za.ac.cput.entity.Reservation;

import java.util.Set;

public interface IReservationRepository extends IRepository<Reservation, String> {
    Set<Reservation> getAll();
}

