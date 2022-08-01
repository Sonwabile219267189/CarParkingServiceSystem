/**
 * ParkingSpaceFactoryTest.java
 * Test class to test ParkingSpaceFactory.java class
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 6 April 2022
 */
package za.ac.cput.carparkingservicesystem.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.carparkingservicesystem.entity.ParkingLot;
import za.ac.cput.carparkingservicesystem.entity.ParkingSpace;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSpaceFactoryTest {

    @Test
    public void testCreateParkingSpace(){
        ParkingLot parkingLot = ParkingLotFactory.build("District6CampusLot","1");
        ParkingSpace parkingSpace = ParkingSpaceFactory.build("4",parkingLot.getParkingLotID(),true);
        assertNotNull(parkingSpace);
        System.out.println(parkingSpace.toString());
    }

    @Test
    public void testParkingSpaceNotSame(){
        ParkingLot parkingLot = ParkingLotFactory.build("District6CampusLot","1");
        ParkingSpace parkingSpace = ParkingSpaceFactory.build("4",parkingLot.getParkingLotID(), true);
        ParkingSpace parkingSpace1 = new ParkingSpace.Builder()
                .copy(parkingSpace)
                .build();
        assertNotSame(parkingSpace1, parkingSpace);

    }

}