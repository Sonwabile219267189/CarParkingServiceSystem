/**
 * ParkingLotRepositoryTest.java
 * Test class for ParkingLotRepository.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Campus;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.factory.ParkingLotFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ParkingLotRepositoryTest {

    private static ParkingLotRepository repository = ParkingLotRepository.getRepository();
    private static ParkingLot parkingLot = ParkingLotFactory.build("District6","1");

    @Test
    @Order(1)
    void create() {
        ParkingLot created = repository.create(parkingLot);
        assertEquals(parkingLot.getParkingLotID(), created.getParkingLotID());
        System.out.println("[Create]: \t" + created);
    }

    @Test
    @Order(2)
    void read() {
        ParkingLot readParkingLot = repository.read(parkingLot.getParkingLotID());
        assertNotNull(readParkingLot);
        System.out.println("[Read]: \t" + readParkingLot);
    }

    @Test
    @Order(3)
    void update() {
        ParkingLot updatedParkingLot = null;
        ParkingLot readParkingLot =repository.read(parkingLot.getParkingLotID());
        if(readParkingLot != null){
            updatedParkingLot = new ParkingLot.Builder().copy(parkingLot)
                    .setParkingLotName("BellvileLot")
                    .setParkingLotNumber("1")
                    .build();

        }
        assertNotNull(repository.update(updatedParkingLot));
        System.out.println("[Update]: \t" + updatedParkingLot);
    }

    @Test
    @Order(5)
    void delete() {
        boolean deleteParkingLot = repository.delete(parkingLot.getParkingLotID());
        assertTrue(deleteParkingLot);
        System.out.println("[Delete]: \t" + deleteParkingLot);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("[Show Repository]: \t");
        System.out.println(repository.getAll());
    }
}