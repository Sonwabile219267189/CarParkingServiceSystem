/* AdminRepository.java
   Author: Nikiwe Mkontshwana(214236714)
   AdminRepository
   Date: 08April2022
 */
/*package za.ac.cput.repository;
import za.ac.cput.entity.Admin;
import java.util.Set;
import java.util.HashSet;



public class AdminRepository implements IAdminRepository{
    private static AdminRepository adminRepository = null;
    private Set<Admin> adminDB = null;

    private AdminRepository(){
        adminDB = new HashSet<Admin>();
    }

    public static AdminRepository getCourseRepository(){
        if (adminRepository == null){
            adminRepository = new AdminRepository();
        }
        return adminRepository;
    }

    @Override
    public Admin create(Admin admin){
        boolean success = adminDB.add(admin);
        if(!success)
            return null;
        return admin;
    }

    @Override
    public Admin read(String adminId){
        for (Admin e : adminDB){
            if (e.getAdminId() == adminId)
                return e;
        }
        return null;
    }

    @Override
    public Admin update(Admin admin){
        Admin oldAdmin = read(admin.getAdminId());
        if (oldAdmin != null){
            adminDB.remove(oldAdmin);
            adminDB.add(admin);
            return admin;
        }
        return null;
    }

    @Override
    public boolean delete(String adminId) {
        Admin adminToDelete = read(adminId);
        if (adminId == null)
            return false;
       adminDB.remove(adminToDelete);
        return true;
    }


    @Override
    public Set<Admin> getAll(){
        return adminDB;
    }
}

 */
