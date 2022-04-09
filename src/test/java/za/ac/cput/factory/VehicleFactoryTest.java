package za.ac.cput.factory;


/*VehicleFactoryTest.java
  Test for vehicleFactory
  Author: Zintle Zothe (216130565)
  Date: 07 April 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {
    @Test
    public void createVehicle(){
        Vehicle vehicle= VehicleFactory.createVehicle("","CF234246","SUV",  "Ford ecosport","Diamond white");
        assertNotNull(vehicle);
        System.out.println(vehicle);

    }
}