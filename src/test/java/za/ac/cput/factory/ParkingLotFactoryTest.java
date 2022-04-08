/**
 * ParkingLotFactoryTest.java
 * Test class to test ParkingLotFactory.java class
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 6 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ParkingLot;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotFactoryTest {

    @Test
    public void testCreateParkingLot(){
        ParkingLot parkingLot = ParkingLotFactory.build("District6CampusLot","2");
        assertNotNull(parkingLot);
        System.out.println(parkingLot.toString());
    }

    @Test
    public void testParkingLotIsSame(){
        ParkingLot parkingLot = ParkingLotFactory.build("District6CampusLot","2");
        ParkingLot parkingLot1 = ParkingLotFactory.build("BellvileCampus","1");
        assertNotSame(parkingLot,parkingLot1);
        System.out.println(parkingLot.toString());
        System.out.println(parkingLot1.toString());

    }

}