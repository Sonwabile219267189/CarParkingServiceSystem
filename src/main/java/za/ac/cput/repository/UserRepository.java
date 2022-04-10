package za.ac.cput.repository;
/** UserRepository.java
 * Author: Abongile Tshopi (214254151)
 * Date: 09 April 2022
 */

import za.ac.cput.entity.User;
import java.util.ArrayList;
import java.util.List;


public class UserRepository implements IUserRepository{

    public static UserRepository repository = null;
    private List<User> userDB;

    //singleton
    private UserRepository(){
        userDB = new ArrayList<>();

    }

    public static UserRepository getRepository(){
        if (repository == null){
            repository = new UserRepository();
        }
        return repository;
    }



    @Override
    public User create(User user) {
        this.userDB.add(user);
        return user;
    }

    @Override
    public User read(String userID) {
        for (User user : userDB)
            if (user.getUserID().equals(userID)) {
                return user;
            }

        return null;
    }

    @Override
    public User update(User user) {
        User outdatedUser = read(user.getUserID());
        if(outdatedUser != null){
            userDB.remove(outdatedUser);
            userDB.add(user);
            return user;
        }
        return null;
    }

    @Override
    public boolean delete(String userID) {
        User userDelete = read(userID);
        if(userDelete == null){
            return false;
        }
        userDB.remove(userDelete);
        return true;
    }

    @Override
    public List<User> getAll() {
        return userDB;
    }
}
