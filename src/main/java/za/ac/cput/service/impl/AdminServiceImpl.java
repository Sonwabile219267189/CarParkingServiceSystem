/* AdminService.java
   Author: Nikiwe Mkontshwana(214236714)
   AdminService
   Date: 12August2022
 */

package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Admin;
import za.ac.cput.repository.IAdminRepository;
import za.ac.cput.service.AdminService;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private IAdminRepository repository;

    public AdminServiceImpl(IAdminRepository repository){
        this.repository = repository;
    }

    @Override
    public Admin create(Admin admin) {
        return this.repository.save(admin);
    }

    @Override
    public Admin read(String admin) {
        return this.repository.findById(admin).orElse(null);

    }

    @Override
    public Admin update(Admin admin) {

        if(this.repository.existsById(admin.getAdminId())){
            return this.repository.save(admin);
        }
        return null;
    }

    @Override
    public boolean delete(String adminId) {
        if(this.repository.existsById(adminId)) {
            this.repository.deleteById(adminId);
            return true;
        }
        return false;
    }

    @Override
    public List<Admin> findAll(){
        return this.repository.findAll();
    }
}




