package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Reservation;
import za.ac.cput.factory.ReservationFactory;
import za.ac.cput.factory.ReservationStatusFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
public class ReservationServiceImplTest {

    @Autowired
    private ReservationServiceImpl SERVICE;

    private static Reservation reservation = ReservationFactory.build("T342","A23",
            "20 Sept 2022", ReservationStatusFactory.build("L15",
                    "Completed"));

    @Test
    void create(){
        Reservation create = this.SERVICE.create(reservation);
        assertNotNull(create);
        System.out.println(create);
    }

    @Test
    void read(){
        Reservation read = this.SERVICE.read(reservation.getReservationID());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update(){
        Reservation update = this.SERVICE.update(new Reservation.Builder().copy(reservation)
                .setReservationID("T453").build());
        assertNotNull(update);
        System.out.println(update);
    }

    @Test
    void delete(){
        boolean delete = this.SERVICE.delete(reservation.getReservationID());
        assertTrue(delete);
    }

    @Test
    void findAll(){
        List<Reservation> findAll = this.SERVICE.findAll();
        assertNotNull(findAll);
        System.out.println(findAll);
    }
}
