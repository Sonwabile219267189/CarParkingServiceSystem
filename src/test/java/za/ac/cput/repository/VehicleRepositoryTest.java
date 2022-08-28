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
   private static VehicleRepository repository;
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
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()->assertSame(saved, read.get())
        );
        System.out.println("read "+'\n'+read.get());
    }

    @Test
    void a_delete() {
        Vehicle saved = repository.save(vehicle);
        List<Vehicle> vehicleDB=repository.getAll();
        assertEquals(1,vehicleDB.size());
        repository.delete(saved);
        System.out.println("Vehicles on the list "+'\n'+vehicleDB);
        vehicleDB= repository.getAll();
        assertEquals(0,vehicleDB.size());
    }



    @Test
    void d_findAll() {
        System.out.println("List all vehicles");
        System.out.println(repository.getAll());
    }


////    // CRUD
////    // C->Create test
////    @Test
////    void a_create() {
////        Vehicle created = repository.create(vehicle);
////        assertNotNull(created);
////        assertEquals(created.getVehicleNumberPlate(),vehicle.getVehicleNumberPlate());
////        System.out.println("Created: "+ created);
////
////    }
////
////    // CRUD
////// R->Read test
////    @Test
////    void b_read() {
////        Vehicle read= repository.read(vehicle.getVehicleNumberPlate());
////        assertNotNull(read);
////        assertEquals(read.getVehicleNumberPlate(),vehicle.getVehicleNumberPlate());
////        System.out.println("Read: "+ read);
////    }
//
////    // CRUD
////// U->Update test
////
//////    @Test
//////    void c_update() {
//////        Vehicle secondVehicle =new Vehicle.Builder().copy(vehicle).setVehicleNumberPlate("CA555246").setVehicleModel("Toyota hilux,Truck").setVehicleColour("Nebula Blue").build();
//////       assertNotNull(repository.update(secondVehicle));
//////        System.out.println("Update: "+ secondVehicle);
//////    }
////
////    // CRUD
////// D->Delete test
////    @Test
////    void e_delete() {
////        boolean deleted = repository.delete(vehicle.getVehicleNumberPlate());
////        assertTrue(deleted);
////        System.out.println("Delete: "+ true);
////
////    }
////
////    // getAll method test
////    @Test
////    void d_getAll() {
////        System.out.print("display all vehicles: ");
////        System.out.println(repository.getAll());
////    }
//
}