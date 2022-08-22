package za.ac.cput.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.factory.ParkingLotFactory;
import za.ac.cput.service.ParkingLotService;
import za.ac.cput.service.impl.ParkingLotServiceImpl;

import java.util.List;

@RestController
@RequestMapping("carparkingservice/parkinglot")
@Slf4j
public class ParkingLotController {

    @Autowired
    private ParkingLotServiceImpl service;

    private ParkingLotController(ParkingLotServiceImpl service){
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<ParkingLot> create(@RequestBody ParkingLot parkingLot){
        log.info("Create request: {}", parkingLot);
        ParkingLot p = ParkingLotFactory.build(parkingLot.getCampusName(), parkingLot.getParkingLotNumber());
        ParkingLot create = service.create(p);
        return ResponseEntity.ok(create);
    }

    //read
    @GetMapping("/read/{s}")
    public ResponseEntity<ParkingLot> read(@PathVariable String s){
        log.info("Read request: {}", s);
        ParkingLot read = service.read(s);
        if(read.equals(null)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(read);
    }

    //delete
    @DeleteMapping("/delete/{s}")
    public ResponseEntity<Boolean> delete(@PathVariable String s){
        log.info("Delete request: {}", s);
        boolean p = service.delete(s);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("update")
    public ResponseEntity<ParkingLot> update(@RequestBody ParkingLot parkingLot){
        log.info("Update request: {}", parkingLot);
        ParkingLot update = service.update(parkingLot);
        return ResponseEntity.ok(update);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ParkingLot>> getAll(){
        List<ParkingLot> parkingLots = service.findAll();
        log.info("GetAllRequest: {}" ,parkingLots);
        return ResponseEntity.ok(parkingLots);
    }

}
