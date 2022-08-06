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
    //successful test with correct input
    public void createVehicle(){
        Vehicle vehicle= VehicleFactory.createVehicle("CF234246",  "Ford eco-sport, SUV","Diamond white");
        assertNotNull(vehicle);
        System.out.println(vehicle);

    }

    @Test
        //Incorrect string input to test the isEmptyOrNull method
    void CreateVehicleWithAnError(){
        Exception exception=assertThrows(IllegalArgumentException.class, ()->
                VehicleFactory.createVehicle("","Ford eco-sport, SUV","Diamond white"));
        System.out.println( exception.getMessage()+": vehicleNumberplate");

    }
}