/*RoleController.java
  controller for the role
  Author: Zintle Zothe (216130565)
  Date: October 2022
 */
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Role;
import za.ac.cput.factory.RoleFactory;
import za.ac.cput.service.RoleService;
import za.ac.cput.service.impl.RoleServiceImpl;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("carparkingservice/role")
public class RoleController {

    private RoleServiceImpl roleService;

    @Autowired
    RoleController(RoleServiceImpl roleService){
        this.roleService=roleService;
    }

    //C-> Create
    @PostMapping("/create")
    public Role create(@RequestBody Role role){
        Role newRole= RoleFactory.createRole(role.getRoleName());
        return roleService.create(newRole);
    }

    //R-> Read
    @GetMapping("/read/{id}")
    public Role read(@PathVariable String id){
        return roleService.read(id);
    }

    //U->Update
    @PostMapping("/update")
    public Role update(@RequestBody Role role){
        return roleService.update(role);
    }

    //D-> delete
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return roleService.delete(id);
    }

    @GetMapping("/getall")
    public List<Role> getAll(){
        return roleService.getAll();
    }

}
