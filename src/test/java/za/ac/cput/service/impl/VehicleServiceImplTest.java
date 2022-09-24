/*VehicleServiceTest.java
  Test for the VehicleService
  Author: Zintle Zothe (216130565)
  Date: August 2022
 */

package za.ac.cput.service.impl;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.User;
import za.ac.cput.entity.Vehicle;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.factory.VehicleFactory;

import static org.junit.jupiter.api.Assertions.*;
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
        //assetNotNull(created);
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
        Vehicle oldVehicle =service.read("CA555246");
        Vehicle updated=new Vehicle.Builder().copy(oldVehicle).setVehicleModel("Toyota hilux,Truck").setVehicleColour("Nebula Blue").build();
        assertNotNull(service.update(updated));
        System.out.println("Delete: "+ updated);
    }

    @Test
    void e_delete(){
        boolean success=service.delete("CF234246");
        assertTrue(success);
        System.out.println("delete: "+ success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(service.getAll());

    }
}