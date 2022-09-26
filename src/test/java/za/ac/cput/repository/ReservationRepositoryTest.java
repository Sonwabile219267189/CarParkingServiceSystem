/* CarParkingServiceSystem.java
 Repository test for Reservation class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 11 April 2022
 */
package za.ac.cput.repository;

        import org.junit.jupiter.api.MethodOrderer;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.TestMethodOrder;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import za.ac.cput.entity.Reservation;
        import za.ac.cput.entity.ReservationStatus;
        import za.ac.cput.factory.ReservationFactory;
        import za.ac.cput.factory.ReservationStatusFactory;

        import java.util.Optional;

        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest

public class ReservationRepositoryTest {

    @Autowired
    private IReservationRepository reservationRepository;

    private Reservation reservation = ReservationFactory.build("T726",
            "L2", "08 Sept 2022", ReservationStatusFactory.build(
                    "T3423", "Reserverd"));

    @Test
    public void save() {
        Reservation save = reservationRepository.save(reservation);
        assertNotNull(save);
        System.out.println("Save reservation: " + save);
    }

    @Test
    public void read() {
        Reservation save = reservationRepository.save(reservation);

        Optional<Reservation> read = reservationRepository.findById(
                reservation.getReservationID());
        assertNotNull(read);
        System.out.println("Read reservation: " + read);
    }

    @Test
    public void delete() {
        Reservation delete = reservationRepository.save(reservation);

        reservationRepository.deleteAll();
        System.out.println(reservationRepository.findAll());
    }

    @Test
    public void getAll() {
        Reservation getAll = reservationRepository.save(reservation);

        System.out.println(reservationRepository.findAll());
    }
}
