package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ParkingLot;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotFactoryTest {

    @Test
    public void testCreateParkingLot(){
        ParkingLot parkingLot = ParkingLotFactory.build("543345","A1","2");
        assertNotNull(parkingLot);
        System.out.println(parkingLot.toString());
    }

    @Test
    public void testParkingLotIsSame(){
        ParkingLot parkingLot = ParkingLotFactory.build("543345","A1","2");
        ParkingLot parkingLot1 = ParkingLotFactory.build("65457","B1","1");
        assertNotSame(parkingLot,parkingLot1);

    }

}