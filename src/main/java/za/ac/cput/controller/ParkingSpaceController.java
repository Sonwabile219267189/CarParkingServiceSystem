/**
 * ParkingSpaceController.java
 * Controller class for ParkingSpace.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 August 2022
 */
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.ParkingSpace;
import za.ac.cput.service.impl.ParkingSpaceServiceImpl;

@RestController
@RequestMapping("carparkingservice/parkingspace")
public class ParkingSpaceController {

    @Autowired
    private ParkingSpaceServiceImpl service;

    private ParkingSpaceController(ParkingSpaceServiceImpl service){
        this.service = service;
    }

    //create object
    @PostMapping("/create")
    public ParkingSpace create(@RequestBody ParkingSpace parkingSpace){
        return service.create(parkingSpace);
    }
}
