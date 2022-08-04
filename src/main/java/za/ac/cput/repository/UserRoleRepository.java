package za.ac.cput.repository;

/** UserRoleRepository.java
 * Author: Abongile Tshopi (214254151)
 * Date: 09 April 2022
 */
import za.ac.cput.entity.UserRole;

import java.util.ArrayList;
import java.util.List;

public class UserRoleRepository implements IUserRoleRepository{
    public static UserRoleRepository repository = null;
    private List<UserRole> userRoleDB;

    //singleton
    private UserRoleRepository(){
        userRoleDB = new ArrayList<>();

    }

    public static UserRoleRepository getRepository(){
        if (repository == null){
            repository = new UserRoleRepository();
        }
        return repository;
    }



    @Override
    public UserRole create(UserRole userRole) {
        this.userRoleDB.add(userRole);
        return userRole;
    }

    @Override
    public UserRole read(String userID) {
        for (UserRole userRole : userRoleDB)
            if (userRole.getUserID().equals(userID)) {
                return userRole;
            }

        return null;
    }

    @Override
    public UserRole update(UserRole userRole) {
        UserRole outdatedUserRole = read(userRole.getUserID());
        if(outdatedUserRole != null){
            userRoleDB.remove(outdatedUserRole);
            userRoleDB.add(userRole);
            return userRole;
        }
        return null;
    }

    @Override
    public boolean delete(String userID) {
        UserRole userRoleDelete = read(userID);
        if(userRoleDelete == null){
            return false;
        }
        userRoleDB.remove(userRoleDelete);
        return true;
    }

    @Override
    public List<UserRole> getAll() {
        return userRoleDB;
    }

}
