package za.ac.cput.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.entity.User;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.service.impl.UserServiceImpl;
import java.util.List;

@RestController
@RequestMapping("carparkingservice/user")
@Slf4j
public class UserController {
    @Autowired
    private UserServiceImpl service;

    private UserController(UserServiceImpl service) {
        this.service = service;
    }

    // create method
    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user){
        log.info("Create request: {}", user);
        User u = UserFactory.build(user.getFirstName(), user.getLastName(), user.getAddress(), user.getCellNumber(), user.getEmailAddress());
        User create = service.create(u);
        return ResponseEntity.ok(create);

    }

    //read
    @GetMapping("/read/{s}")
    public ResponseEntity<User> read(@PathVariable String s){
        log.info("Read request: {}", s);
        User read = service.read(s);
        if(read.equals(null)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(read);
    }

    //Update
    @PostMapping("update")
    public ResponseEntity<User> update(@RequestBody User user){
        log.info("Update request: {}", user);
        User update = service.update(user);
        return ResponseEntity.ok(update);
    }
    ///delete
    @DeleteMapping("/delete/{s}")
    public ResponseEntity<Boolean> delete(@PathVariable String s){
        log.info("Delete request: {}", s);
        boolean u = service.delete(s);
        return ResponseEntity.noContent().build();
    }
    //getAll
    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll(){
        List<User> user = service.findAll();
        log.info("GetAllRequest: {}" ,user);
        return ResponseEntity.ok(user);
    }
}
