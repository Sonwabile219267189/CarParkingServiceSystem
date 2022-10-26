package za.ac.cput.repository;

/*VehicleRepositoryTest.java
  Test for the VehicleRepository
  Author: Zintle Zothe (216130565)
  Date: 08 April 2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.User;
import za.ac.cput.entity.Vehicle;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.factory.VehicleFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
 class VehicleRepositoryTest {

   @Autowired
   private VehicleRepository repository;
   private static User user=UserFactory.build("Abongile","Tshopi", "42071 Makhaza khayelitsha",
            "0734561234","aboshT2@gmail.com");
   private static Vehicle vehicle= VehicleFactory.createVehicle("CF234246",user.getUserID(),"Ford ecosport, SUV","Diamond white");


    @Test
    void b_save(){
        Vehicle saved=repository.save(vehicle);
        assertNotNull(saved);
        assertEquals(saved.getVehicleNumberPlate(),vehicle.getVehicleNumberPlate());
        System.out.println("Saved: "+'\n'+saved);
    }



    @Test
    void c_read() {
        Vehicle saved=repository.save(vehicle);
        Optional<Vehicle> read= repository.findById(saved.getVehicleNumberPlate());
        assertNotNull(saved);
        assertEquals(saved.getVehicleNumberPlate(),vehicle.getVehicleNumberPlate());
        System.out.println("read "+'\n'+read.get());
    }

    @Test
    void a_delete() {
        Vehicle saved = repository.save(vehicle);
        List<Vehicle> vehicleDB=repository.findAll();
        assertEquals(1,vehicleDB.size());
        repository.delete(saved);
        System.out.println("Vehicles on the list "+'\n'+vehicleDB);
        vehicleDB= repository.findAll();
        assertEquals(0,vehicleDB.size());
    }



    @Test
    void d_findAll() {
        System.out.println("List all vehicles");
        System.out.println(repository.findAll());
    }


}