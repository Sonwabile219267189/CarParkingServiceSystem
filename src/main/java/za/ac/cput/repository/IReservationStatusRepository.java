/* CarParkingServiceSystem.java
    Interface Repository for the Reservation Status Class.
    Author: Siyamtanda Tonjeni (217107958)
    Date: 10 April 2022
 */
package za.ac.cput.repository;


import za.ac.cput.entity.ReservationStatus;

import java.util.Set;

public interface IReservationStatusRepository extends IRepository<ReservationStatus, String> {
    Set<ReservationStatus> getAll();
}
