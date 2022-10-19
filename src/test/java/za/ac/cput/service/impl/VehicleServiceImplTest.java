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

    //users
    private static User user1= UserFactory.build("Abongile","Tshopi", "42071 Makhaza khayelitsha",
            "0734561234","aboshT2@gmail.com");
    private static User user2= UserFactory.build("Charles","Korry", "38 Mangoose Sea-Point",
            "0627894563","KorryC@yahoo.com");

    //vehicles
    private static Vehicle vehicle1 = VehicleFactory.createVehicle("CF234246", user1.getUserID(), "Ford eco-sport, SUV","Diamond white");
    private static Vehicle vehicle2 = VehicleFactory.createVehicle("CF510156", user1.getUserID(), "Toyota Hilux, truck","Nebula blue");
    private static Vehicle vehicle3 = VehicleFactory.createVehicle("CF369125", user2.getUserID(), "Hyundai Accent, sedan","Black");


    @Test
    void a_create(){
        Vehicle created1= service.create(vehicle1);
        assertNotNull(created1);
        assertEquals(created1.getVehicleNumberPlate(),vehicle1.getVehicleNumberPlate());
        System.out.println("Create: "+created1);

        Vehicle created2= service.create(vehicle2);
        assertNotNull(created2);
        assertEquals(created2.getVehicleNumberPlate(),vehicle2.getVehicleNumberPlate());
        System.out.println("Create: "+created2);

        Vehicle created3= service.create(vehicle3);
        assertNotNull(created3);
        assertEquals(created3.getVehicleNumberPlate(),vehicle3.getVehicleNumberPlate());
        System.out.println("Create: "+created3);

    }

    @Test
    void b_read(){
        Vehicle read =service.read(vehicle1.getVehicleNumberPlate());
        assertNotNull(read);
        assertEquals(read.getVehicleNumberPlate(),vehicle1.getVehicleNumberPlate());
        System.out.println("Read: "+read);
    }

    @Test
    void c_update(){

        Vehicle oldVehicle =service.read(vehicle1.getVehicleNumberPlate());
        assertEquals(oldVehicle.getUserID(),vehicle1.getUserID());
        Vehicle updated=this.service.update(new Vehicle.Builder().copy(oldVehicle).setVehicleColour("Red").build());
        assertNotNull(updated);
        System.out.println("Update successful : "+ updated);

    }

    @Test
    void e_delete(){
        boolean success=service.delete(vehicle1.getVehicleNumberPlate());
        assertTrue(success);
        System.out.println("delete: "+ success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(service.getAll());

    }

//    @Test
//    void f_findVehicleGivenUserId(){
//        Vehicle vehicle=service.findVehicleGivenUserId(vehicle3.getUserID());
//        System.out.println("User "+ vehicle3.getUserID() + "has the following vehicle: ");
//        System.out.println(vehicle);
//    }
//
    @Test
    void g_findVehiclesGivenUserId(){
        List<Vehicle>  vehicles=service.findVehiclesGivenUserId(vehicle2.getUserID());
        System.out.println("User "+ vehicle2.getUserID() + " has the following vehicle: ");
        System.out.println(vehicles);
    }
}