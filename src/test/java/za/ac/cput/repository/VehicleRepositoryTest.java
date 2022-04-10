package za.ac.cput.repository;

/*VehicleRepositoryTest.java
  Test for the VehicleRepository
  Author: Zintle Zothe (216130565)
  Date: 08 April 2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Vehicle;
import za.ac.cput.factory.VehicleFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class VehicleRepositoryTest {
    private static VehicleRepository repository=VehicleRepository.getRepository();
    private static Vehicle vehicle= VehicleFactory.createVehicle("CF234246","SUV",  "Ford ecosport","Diamond white");


    // CRUD
    // C->Create test
    @Test
    void a_create() {
        Vehicle created = repository.create(vehicle);
        assertNotNull(created);
        assertEquals(created.getVehicleId(),vehicle.getVehicleId());
        System.out.println("Created: "+ created);

    }

    // CRUD
// R->Read test
    @Test
    void b_read() {
        Vehicle read= repository.read(vehicle.getVehicleId());
        assertNotNull(read);
        assertEquals(read.getVehicleId(),vehicle.getVehicleId());
        System.out.println("Read: "+ read);
    }

    // CRUD
// U->Update test
    @Test
    void c_update() {
        Vehicle updated =new Vehicle.Builder().copy(vehicle).setVehiclePlateNumber("CA241035").setVehicleType("Truck").setVehicleModel("Toyota hilux").setVehicleColour("Nebula Blue").build();
        assertNotNull(repository.update(updated));
        System.out.println("Update: "+ updated);
    }

    // CRUD
// D->Delete test
    @Test
    void e_delete() {
        boolean deleted = repository.delete(vehicle.getVehicleId());
        assertTrue(deleted);
        System.out.println("Delete: "+ true);

    }

    // getAll method test
    @Test
    void d_getAll() {
        System.out.print("display all vehicles: ");
        System.out.println(repository.getAll());
    }
}