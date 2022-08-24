/* AdminFactory.java
   Author: Nikiwe Mkontshwana (214236714)
   Factory-Admin
   Date: 07April2022
*/

package za.ac.cput.factory;
import za.ac.cput.entity.Admin;

public class AdminFactory {

    public static Admin createAdmin(String adminId, String firstName, String lastName){
        return new Admin.Builder().setAdminId(adminId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();

    }
}