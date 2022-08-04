/* CarParkingServiceSystem.java
 Repository test for Reservation status class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 11 April 2022
 */

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.ReservationStatus;
import za.ac.cput.factory.ReservationStatusFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)

public class ReservationStatusRepositoryTest {

    private static ReservationStatusRepository ReservationStatusRepository = new ReservationStatusRepository();
    private ReservationStatus reservationStatus = ReservationStatusFactory.build("Reserved");

    @Test
    public void create(){
        ReservationStatus created = ReservationStatusRepository.create("Reserved");
        assertEquals(reservationStatus.getReservationID(), created.getReservationID());
        System.out.println("Created" + created);
    }

    @Test
    public void update(){
        ReservationStatus updated = new ReservationStatus.Builder().copy(reservationStatus).setComplete("Empty").build();
        System.out.println("Updated" + updated);
    }

    @Test
    public void read(){
        ReservationStatus read = ReservationStatusRepository.read(reservationStatus.getReservationID());
        System.out.println("Read" +read);
    }

    @Test
    public void delete(){
        ReservationStatusRepository.delete(reservationStatus.getReservationID());
        System.out.println("Deleted" + reservationStatus.getReservationID() + "");
    }

    @Test
    public void getAll() {
        System.out.print("display all reserved: ");
        System.out.println(ReservationStatusRepository.getAll());
    }

}
