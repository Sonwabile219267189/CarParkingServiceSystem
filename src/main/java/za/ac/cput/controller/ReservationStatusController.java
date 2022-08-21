/* CarParkingServiceSystem.java
 Controller for a Reservation Status Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 19 August 2022
 */
package za.ac.cput.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.ReservationStatus;
import za.ac.cput.service.impl.ReservationStatusServiceImpl;

import java.util.List;

@RestController
@RequestMapping("cput/reservation-status/")
public class ReservationStatusController {
    private final ReservationStatusServiceImpl reservationStatusService;

    public ReservationStatusController(ReservationStatusServiceImpl reservationStatusService){
        this.reservationStatusService = reservationStatusService;
    }

    @PostMapping("create")
    public ResponseEntity<ReservationStatus> create(ReservationStatus reservationStatus){
        ReservationStatus create = reservationStatusService.create(reservationStatus);
        return ResponseEntity.ok(create);
    }

    @GetMapping("read")
    public ResponseEntity<ReservationStatus> read(String reservationStatus){
        ReservationStatus reservationStatus1 = this.reservationStatusService.read(reservationStatus);
        return ResponseEntity.ok(reservationStatus1);
    }

    @PutMapping("update")
    public ResponseEntity<ReservationStatus> update(ReservationStatus reservationStatus){
        ReservationStatus update = reservationStatusService.update(reservationStatus);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("delete/{reservationStatusID}")
    public ResponseEntity<Boolean> delete(@PathVariable String reservationStatusID){
        this.reservationStatusService.delete(reservationStatusID);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("all")
    public ResponseEntity<List<ReservationStatus>> findAll(){
        List<ReservationStatus> reservationStatusList = this.reservationStatusService.findAll();
        return ResponseEntity.ok(reservationStatusList);
    }
}
