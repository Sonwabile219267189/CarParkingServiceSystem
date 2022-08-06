package za.ac.cput.factory;

import za.ac.cput.entity.UserRole;
import za.ac.cput.util.Helper;

public class UserRoleFactory {

        public static UserRole build(){

            String userID = Helper.generateUUID();
            String roleID = Helper.generateUUID();

            return new UserRole.Builder()
                    .setUserID (userID)
                    .setRoleID(roleID)
                    .build();
        }
    }
