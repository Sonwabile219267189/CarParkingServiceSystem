/**
 * ParkingLotFactoryTest.java
 * Test class to test ParkingLotFactory.java class
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 6 August 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ParkingLot;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotFactoryTest {

    @Test
    public void testCreateParkingLot(){
        ParkingLot parkingLot = ParkingLotFactory.build("District 6","2");
        assertNotNull(parkingLot);
        System.out.println(parkingLot.toString());
    }

    @Test
    public void testParkingLotNotSame(){
        ParkingLot parkingLot = ParkingLotFactory.build("District 6","2");
        ParkingLot parkingLot1 = ParkingLotFactory.build("Bellvile","1");
        assertNotSame(parkingLot,parkingLot1);
        System.out.println(parkingLot.toString());
        System.out.println(parkingLot1.toString());

    }

}