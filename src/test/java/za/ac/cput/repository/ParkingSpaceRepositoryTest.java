/**
 * ParkingSpaceRepositoryTest.java
 * Test for ParkingSpaceRepository.java
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
import za.ac.cput.entity.ParkingSpace;
import za.ac.cput.factory.ParkingLotFactory;
import za.ac.cput.factory.ParkingSpaceFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ParkingSpaceRepositoryTest {

    private static ParkingSpaceRepository repository = ParkingSpaceRepository.getRepository();
    private static ParkingLot parkingLot = ParkingLotFactory.build("District6","1");
    private static ParkingSpace parkingSpace = ParkingSpaceFactory.build("1",parkingLot.getParkingLotID(), true);

    @Test
    @Order(1)
    void create() {
        ParkingSpace created = repository.create(parkingSpace);
        assertNotNull(created);
        System.out.println("[Create]: \t" + created);
    }

    @Test
    @Order(2)
    void read() {
        ParkingSpace readParkingSpace = repository.read(parkingSpace.getParkingSpaceID());
        assertNotNull(readParkingSpace);
        System.out.println("[Read]: \t" + readParkingSpace);
    }

    @Test
    @Order(3)
    void update() {
        ParkingSpace updatedParkingSpace = null;
        ParkingSpace readParkingSpace =repository.read(parkingSpace.getParkingSpaceID());
        if(readParkingSpace != null){
            updatedParkingSpace = new ParkingSpace.Builder().copy(parkingSpace)
                    .setParkingSpaceNumber("5")
                    .build();
        }
        assertNotNull(repository.update(updatedParkingSpace));
        System.out.println("[Update]: \t" + updatedParkingSpace);
    }

    @Test
    @Order(5)
    void delete() {
        boolean deleteParkingSpace = repository.delete(parkingSpace.getParkingSpaceID());
        assertTrue(deleteParkingSpace);
        System.out.println("[Delete]: \t" + deleteParkingSpace);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("[Show Repository]: \t");
        System.out.println(repository.getAll());
    }
}