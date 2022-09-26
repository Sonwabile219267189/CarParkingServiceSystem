/* DepartmentFactoryTest.java
   Author: Nikiwe Mkontshwana (214236714)
   RepositoryTest-Admin
   Date: 10April2022
 */
//package za.ac.cput.repository;
//
//import org.junit.jupiter.api.Test;
//import za.ac.cput.factory.AdminFactory;
////import za.ac.cput.repository.admin.impl.AdminRepository;
//import za.ac.cput.repository.IAdminRepository;
//import za.ac.cput.entity.Admin;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class AdminRepositoryTest {
//
//
//    private static AdminRepository repository = AdminRepository.getRepository();
//
//    private static Admin admin = AdminFactory.createAdmin("NMboekoe01","Nikie", "Mboekoe");
//
//
//    @Test
//    void create() {
//        Admin created = repository.create(admin);
//        assertEquals(created.getAdminId(),admin.getAdminId());
//        System.out.println("Create: "+ created);
//    }
//
//    @Test
//    void read() {
//        Admin read = repository.read(admin.getAdminId());
//        assertNotNull(read);
//        //assertEquals(read.getAdminId(),admin.getAdminId());
//        System.out.println("Read: "+ read);
//    }
//
//    @Test
//    void update() {
//        Admin updated = new Admin.Builder().copy(admin).setAdminId("NMboekoe").setFirstName("Nikie").setLastName("Mboekoe").build();
//        assertNotNull(repository.update(updated));
//        System.out.println("Update: "+ updated);
//    }
//
//    @Test
//    void delete() {
//        Admin deleted = repository.delete(admin.getAdminId());
//        assertNotNull(deleted);
//        System.out.println("Delete: "+ deleted);
//    }
//}