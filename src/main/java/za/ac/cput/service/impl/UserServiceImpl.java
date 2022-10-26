package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.User;
import za.ac.cput.repository.UserRepository;
import za.ac.cput.service.UserService;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public User create(User user) {
        return this.repository.save(user);
    }

    @Override
    public User read(String s) {
        return this.repository.findById(s).orElse(null);

    }

    @Override
    public User update(User user) {

        if(this.repository.existsById(user.getUserID())){
            return this.repository.save(user);
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        if(this.repository.existsById(s)) {
            this.repository.deleteById(s);
            return true;
        }
        return false;
    }

    @Override
    public List<User> findAll(){
        return this.repository.findAll();
    }

}
