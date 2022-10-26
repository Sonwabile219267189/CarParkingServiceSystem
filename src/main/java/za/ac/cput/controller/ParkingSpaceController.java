/**
 * ParkingSpaceController.java
 * Controller class for ParkingSpace.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 August 2022
 */
package za.ac.cput.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.entity.ParkingSpace;
import za.ac.cput.factory.ParkingSpaceFactory;
import za.ac.cput.service.impl.ParkingSpaceServiceImpl;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
@RequestMapping("carparkingservice/parkingspace")
@Slf4j
public class ParkingSpaceController {

    @Autowired
    private ParkingSpaceServiceImpl service;

    private ParkingSpaceController(ParkingSpaceServiceImpl service){
        this.service = service;
    }

    //create object
    @PostMapping("/create")
    public ResponseEntity<ParkingSpace> create(@RequestBody ParkingSpace parkingSpace){
        log.info("Create request: {}", parkingSpace);
        ParkingSpace p = ParkingSpaceFactory.build(parkingSpace.getParkingSpaceNumber(), parkingSpace.getParkingLotID(), true);
        ParkingSpace create = service.create(p);
        return ResponseEntity.ok(create);
    }

    @GetMapping("/read/{s}")
    public ResponseEntity<ParkingSpace> read(@PathVariable String s){
        log.info("Read request: {}", s);
        ParkingSpace read = service.read(s);
        if(read.equals(null)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(read);
    }

    @PutMapping("/update")
    public ResponseEntity<ParkingSpace> update(@RequestBody ParkingSpace parkingSpace){
        log.info("Update request: {}", parkingSpace);
        ParkingSpace update = service.update(parkingSpace);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/delete/{s}")
    public ResponseEntity<Boolean> delete(@PathVariable String s){
        boolean p = service.delete(s);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ParkingSpace>> getAll(){
        List<ParkingSpace> parkingSpaces = service.findAll();
        log.info("GetAllRequests: {}", parkingSpaces);
        return ResponseEntity.ok(parkingSpaces);
    }

    @PutMapping("/bookSpaceIfEmpty/{id}")
    public ResponseEntity<ParkingSpace> bookEmptySpaceIfEmpty(@PathVariable String id){
        ParkingSpace bookSpace = service.bookEmptySpaceIfEmpty(id);
        log.info("BookEmptySpaceRequest: {}" ,bookSpace);
        return ResponseEntity.ok(bookSpace);
    }
}
