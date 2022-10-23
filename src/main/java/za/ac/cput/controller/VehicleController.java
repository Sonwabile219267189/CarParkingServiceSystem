/*VehicleController.java
  controller for the vehicle
  Author: Zintle Zothe (216130565)
  Date: October 2022
 */
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.entity.Vehicle;
import za.ac.cput.factory.VehicleFactory;
import za.ac.cput.service.impl.VehicleServiceImpl;

import java.util.List;

@RestController
@RequestMapping("carparkingservice/vehicle")
public class VehicleController {



    private VehicleServiceImpl vehicleService;

    @Autowired
    VehicleController(VehicleServiceImpl vehicleService){
        this.vehicleService=vehicleService;
    }


    // CRUD
    //C-> Create
    @PostMapping("/create")
    public Vehicle create(@RequestBody Vehicle vehicle){
        Vehicle newVehicle= VehicleFactory.createVehicle(vehicle.getVehicleNumberPlate(),vehicle.getUserID(), vehicle.getVehicleModel(), vehicle.getVehicleColour());
        return vehicleService.create(newVehicle);
    }

    //R-> Read
    @GetMapping("/read/{id}")
    public Vehicle read(@PathVariable String vehicleNumberPlate){
        return vehicleService.read(vehicleNumberPlate);
    }

    //U->Update
    @PostMapping("/update")
    public Vehicle update(@RequestBody Vehicle vehicle){
        return vehicleService.update(vehicle);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String vehicleNumberPlate){
        return vehicleService.delete(vehicleNumberPlate);
    }

    @GetMapping("/getall")
    public List<Vehicle> getAll(){
        return vehicleService.getAll();
    }


    @GetMapping("/findvehicle/{id}")
    //get list of vehicles registered by the user: using userid to get vehicles
    public ResponseEntity<List<Vehicle>> getVehiclesGivenUserId(@PathVariable String userID){
        List<Vehicle> vehicles=this.vehicleService.findVehiclesGivenUserId(userID);
        return ResponseEntity.ok(vehicles);
        //return vehicleService.findVehicleGivenUserId(userId);
    }



}
