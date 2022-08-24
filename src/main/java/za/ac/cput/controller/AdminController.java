package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Admin;
import za.ac.cput.factory.AdminFactory;
import za.ac.cput.service.impl.AdminServiceImpl;


@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Admin create(@RequestBody Admin admin){
        Admin newAdmin = AdminFactory.createAdmin(admin.getAdminId(),admin.getFirstName(), admin.getLastName());
        return adminService.create(newAdmin);

    }

    @GetMapping("/read")
    public Admin read(@RequestBody Admin admin){
        return adminService.read(admin.getAdminId());
    }
    @PostMapping("/update")
        public Admin update(@RequestBody Admin admin){
        return adminService.update(admin);
    }

    @PostMapping
    public String delete(@RequestBody Admin admin){
        if(adminService.delete(admin.getAdminId()))
            return "Admin deleted successfully";

        else
            return "Admin could not be deleted";

    }
}


