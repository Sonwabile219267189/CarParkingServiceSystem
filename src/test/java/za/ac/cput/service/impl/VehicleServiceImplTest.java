/*VehicleServiceTest.java
  Test for the VehicleService
  Author: Zintle Zothe (216130565)
  Date: August 2022
 */

package za.ac.cput.service.impl;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.ReservationStatus;
import za.ac.cput.entity.Role;
import za.ac.cput.entity.User;
import za.ac.cput.entity.Vehicle;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.factory.VehicleFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class VehicleServiceImplTest {
    @Autowired
    private VehicleServiceImpl service;

    private static User user= UserFactory.build("Abongile","Tshopi", "42071 Makhaza khayelitsha",
            "0734561234","aboshT2@gmail.com");
    private static Vehicle vehicle = VehicleFactory.createVehicle("CF234246", user.getUserID(), "Ford eco-sport, SUV","Diamond white");

    @Test
    void a_create(){
        Vehicle created= service.create(vehicle);
        assertNotNull(created);
        assertEquals(created.getVehicleNumberPlate(),vehicle.getVehicleNumberPlate());
        System.out.println("Create: "+created);
    }

    @Test
    void b_read(){
        Vehicle read =service.read(vehicle.getVehicleNumberPlate());
        assertNotNull(read);
        assertEquals(read.getVehicleNumberPlate(),vehicle.getVehicleNumberPlate());
        System.out.println("Read: "+read);
    }

    @Test
    void c_update(){

        Vehicle oldVehicle =service.read(vehicle.getVehicleNumberPlate());
        assertEquals(oldVehicle.getUserID(),vehicle.getUserID());
        Vehicle updated=new Vehicle.Builder().copy(oldVehicle).setVehicleModel("Ford eco-sport, SUV").setVehicleColour("Nebula Blue").build();
        assertNotNull(updated);
        System.out.println("Update successful : "+ updated);

    }

    @Test
    void e_delete(){
        boolean success=service.delete(vehicle.getVehicleNumberPlate());
        assertTrue(success);
        System.out.println("delete: "+ success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(service.getAll());

    }

    @Test
    void f_getVehicleGivenUserId(){
        //users
         User user1= UserFactory.build("Abongile","Tshopi", "42071 Makhaza khayelitsha",
                "0734561234","aboshT2@gmail.com");
         //User user2= UserFactory.build("Charles","Korry", "38 Mangoose Sea-Point",
         //       "0627894563","KorryC@yahoo.com");

         //vehicles
        Vehicle vehicle1 = VehicleFactory.createVehicle("CF234246", user1.getUserID(), "Ford eco-sport, SUV","Diamond white");
        Vehicle vehicle2 = VehicleFactory.createVehicle("CF510156", user1.getUserID(), "VW Polo vivo","Spicy red");
        //Vehicle vehicle2 = VehicleFactory.createVehicle("CF510156", user2.getUserID(), "VW Polo vivo","Spicy red");

        Vehicle save = service.create(vehicle1);
        Vehicle  save1 = service.create(vehicle2);

        List<Vehicle>  vehicles=service.getVehicleGivenUserId(vehicle1.getUserID());
        System.out.println(vehicles);
    }
}