package za.ac.cput.factory;

import za.ac.cput.entity.User;
import za.ac.cput.helper.GenerateID;


    public class UserFactory {

        public static User build( String firstName, String lastName, String address, String cellNumber, String emailAddress ){

            String userID = GenerateID.generateUUID();

            return new User.Builder()
                    .setUserID (userID)
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setAddress(address)
                    .setEmailAddress(emailAddress)
                    .setCellNumber(cellNumber)
                    .build();
        }
    }

