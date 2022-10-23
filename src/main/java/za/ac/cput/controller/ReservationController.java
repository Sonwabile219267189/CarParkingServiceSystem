/* CarParkingServiceSystem.java
 Controller for a Reservation Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 19 August 2022
 */
package za.ac.cput.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Reservation;
import za.ac.cput.service.impl.ReservationServiceImpl;

import java.util.List;

@RestController
@RequestMapping("carparkingservice/reservation/")
public class ReservationController {
    private final ReservationServiceImpl reservationService;

    public ReservationController(ReservationServiceImpl reservationService){
        this.reservationService = reservationService;
    }

    @PostMapping("/create")
    public ResponseEntity<Reservation> create(Reservation reservation){
        Reservation create = reservationService.create(reservation);
        return ResponseEntity.ok(create);
    }

    @GetMapping("/read")
    public ResponseEntity<Reservation> read(String reservation){
        Reservation reservation1 = this.reservationService.read(reservation);
        return ResponseEntity.ok(reservation1);
    }

    @PutMapping("update")
    public ResponseEntity<Reservation> update(Reservation reservation){
        Reservation update = reservationService.update(reservation);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("delete/{reservationStatusID}")
    public ResponseEntity<Boolean> delete(@PathVariable String reservationID){
        this.reservationService.delete(reservationID);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/all")
    public ResponseEntity<List<Reservation>> findAll(){
        List<Reservation> reservationList = this.reservationService.findAll();
        return ResponseEntity.ok(reservationList);
    }
}
