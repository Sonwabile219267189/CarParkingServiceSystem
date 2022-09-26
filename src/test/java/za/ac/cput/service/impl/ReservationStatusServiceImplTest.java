package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Reservation;
import za.ac.cput.entity.ReservationStatus;
import za.ac.cput.factory.ReservationFactory;
import za.ac.cput.factory.ReservationStatusFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
public class ReservationStatusServiceImplTest {
    @Autowired
    private ReservationStatusServiceImpl SERVICE;

    private static ReservationStatus reservationStatus = ReservationStatusFactory.build(
            "L15", "Completed");

    @Test
    void create(){
        ReservationStatus create = this.SERVICE.create(reservationStatus);
        assertNotNull(create);
        System.out.println(create);
    }

    @Test
    void read(){
        ReservationStatus read = this.SERVICE.read(reservationStatus.getReservationStatusID());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update(){
        ReservationStatus update = this.SERVICE.update(new ReservationStatus.Builder()
                .copy(reservationStatus).setReservationStatusID("L13").build());
        assertNotNull(update);
        System.out.println(update);
    }

    @Test
    void delete(){
        boolean delete = this.SERVICE.delete(reservationStatus.getReservationStatusID());
        assertTrue(delete);
    }

    @Test
    void findAll(){
        List<ReservationStatus> findAll = this.SERVICE.findAll();
        assertNotNull(findAll);
        System.out.println(findAll);
    }
}
