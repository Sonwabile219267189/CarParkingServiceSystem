package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.entity.ParkingSpace;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSpaceFactoryTest {

    @Test
    public void testCreateParkingSpace(){
        ParkingLot parkingLot = ParkingLotFactory.build("677755","District6Campus","1");
        ParkingSpace parkingSpace = ParkingSpaceFactory.build("654334","4",parkingLot);
        assertNotNull(parkingSpace);
        System.out.println(parkingSpace.toString());
    }

}