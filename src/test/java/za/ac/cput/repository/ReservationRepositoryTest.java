/* CarParkingServiceSystem.java
 Repository test for Reservation class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 11 April 2022
 */
package za.ac.cput.repository;

        import org.junit.jupiter.api.Test;
        import za.ac.cput.entity.Reservation;
        import za.ac.cput.factory.ReservationFactory;

        import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservationRepositoryTest {

    private static ReservationRepository ReservationRepository = new ReservationRepository();
    private Reservation reservation = ReservationFactory.build("John","10/03/2022");

    @Test
    public void create(){
        Reservation created = ReservationRepository.create("John", "10/03/2022");
        assertEquals(reservation.getReservationID(), created.getReservationID());
        System.out.println("Created" + created);
    }

    @Test
    public void update(){
        Reservation updated = new Reservation.Builder().copy(reservation).setDateOfReservation("27/03/2022").build();
        System.out.println("Updated" + updated);
    }

    @Test
    public void read(){
        Reservation read = ReservationRepository.read(reservation.getReservationID());
        System.out.println("Read" +read);
    }

    @Test
    public void delete(){
        ReservationRepository.delete(reservation.getReservationID());
        System.out.println("Deleted" + reservation.getReservationID() + "");
    }

}