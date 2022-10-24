//package za.ac.cput.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.entity.UserRole;
//import za.ac.cput.repository.UserRoleRepository;
//import za.ac.cput.service.UserRoleService;
//
//import java.util.List;
//
//@Service
//public class UserRoleServiceImpl implements UserRoleService {
//
//    @Autowired
//    private UserRoleRepository repository;
//
//    public UserRoleServiceImpl(UserRoleRepository repository){
//        this.repository = repository;
//    }
//
//    @Override
//    public UserRole create(UserRole userRole) {
//        return this.repository.save(userRole);
//    }
//
//    @Override
//    public UserRole read(String s) {
//        return this.repository.findById(s).orElse(null);
//
//    }
//
//    @Override
//    public UserRole update(UserRole userRole) {
//
//        if(this.repository.existsById(userRole.getUserID())){
//            return this.repository.save(userRole);
//        }
//        return null;
//    }
//
//    @Override
//    public boolean delete(String s) {
//        if(this.repository.existsById(s)) {
//            this.repository.deleteById(s);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public List<UserRole> findAll(){
//        return this.repository.findAll();
//    }
//}
