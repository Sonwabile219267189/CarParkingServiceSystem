package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Department;
import za.ac.cput.factory.DepartmentFactory;
import za.ac.cput.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Department create(@RequestBody Department department) {
        Department newDepartment = DepartmentFactory.build(department.getDepartmentId(), department.getDepartmentName(), department.getCampusLocation());
        return departmentService.create(newDepartment);

    }

    @GetMapping("/read")
    public Department read(@RequestBody Department department) {
        return departmentService.read(department.getDepartmentId());
    }

    @PostMapping("/update")
    public Department update(@RequestBody Department department) {
        return departmentService.update(department);
    }

    /*@PostMapping
    public boolean delete(@PathVariable Department department) {
        if (DepartmentService.delete(department.getDepartmentId());
           return "Department deleted successfully";

        else
            return "Department could not be deleted";

    } */

    }

