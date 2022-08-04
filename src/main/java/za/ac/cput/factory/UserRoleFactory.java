package za.ac.cput.factory;

import za.ac.cput.entity.UserRole;
import za.ac.cput.helper.GenerateID;

public class UserRoleFactory {

        public static UserRole build(){

            String userID = GenerateID.generateUUID();
            String roleID = GenerateID.generateUUID();

            return new UserRole.Builder()
                    .setUserID (userID)
                    .setRoleID(roleID)
                    .build();
        }
    }
