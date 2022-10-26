//package za.ac.cput.controller;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//import za.ac.cput.entity.UserRole;
//import za.ac.cput.factory.UserRoleFactory;
//import za.ac.cput.service.impl.UserRoleServiceImpl;
//import java.util.List;
//
//
//@RestController
//@RequestMapping("carparkingservice/userrole")
//@Slf4j
//public class UserRoleController {
//    @Autowired
//    private UserRoleServiceImpl service;
//
//    private UserRoleController(UserRoleServiceImpl service) {
//        this.service = service;
//    }
//
//    // create method
//    @PostMapping("/create")
//    public ResponseEntity<UserRole> create(@RequestBody UserRole userRole){
//        log.info("Create request: {}", userRole);
//        UserRole usR = UserRoleFactory.build(userRole.service);
//        UserRole create = service.save(usR);
//        return ResponseEntity.ok(create);
//
//    }
//
//    //read
//    @GetMapping("/read/{s}")
//    public ResponseEntity<UserRole> read(@PathVariable String s){
//        log.info("Read request: {}", s);
//        UserRole read = service.read(s);
//        if(read.equals(null)){
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        }
//        return ResponseEntity.ok(read);
//    }
//
//    //delete
//    @DeleteMapping("/delete/{s}")
//    public ResponseEntity<Boolean> delete(@PathVariable String s){
//        log.info("Delete request: {}", s);
//        boolean usR = service.delete(s);
//        return ResponseEntity.noContent().build();
//    }
//
//    //Update
//    @PostMapping("update")
//    public ResponseEntity<UserRole> update(@RequestBody UserRole userRole){
//        log.info("Update request: {}", userRole);
//        UserRole update = service.update(userRole);
//        return ResponseEntity.ok(update);
//    }
//
//    //getAll
//    @GetMapping("/getAll")
//    public ResponseEntity<List<UserRole>> getAll(){
//        List<UserRole> userRole = service.findAll();
//        log.info("GetAllRequest: {}" ,userRole);
//        return ResponseEntity.ok(userRole);
//    }
//}
//
//