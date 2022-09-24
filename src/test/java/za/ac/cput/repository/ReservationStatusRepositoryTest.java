/* CarParkingServiceSystem.java
 Repository test for Reservation status class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 11 April 2022
 */

package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.ReservationStatus;
import za.ac.cput.factory.ReservationStatusFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

public class ReservationStatusRepositoryTest {

    @Autowired
    private IReservationStatusRepository reservationStatusRepository;
    private ReservationStatus reservationStatus = ReservationStatusFactory.build("T4355",
            "reserved");

    @Test
    public void save(){
        ReservationStatus save = reservationStatusRepository.save(reservationStatus);
        assertNotNull(save);
        System.out.println("Save reservation status: " + save);
    }

    @Test
    public void read(){
        ReservationStatus save = reservationStatusRepository.save(reservationStatus);

        Optional<ReservationStatus> read = reservationStatusRepository.findById(
                reservationStatus.getReservationStatusID());
        assertNotNull(read);
        System.out.println("Read reservation status: " + read);
    }

    @Test
    public void delete(){
        ReservationStatus delete = reservationStatusRepository.save(reservationStatus);

        reservationStatusRepository.deleteAll();
        System.out.println(reservationStatusRepository.findAll());
    }

    @Test
    public void getAll() {
        ReservationStatus getAll = reservationStatusRepository.save(reservationStatus);

        System.out.println(reservationStatusRepository.findAll());
    }

}
