//package za.ac.cput.repository;
//
///*RoleRepository.java
//  Repository for the Role
//  Author: Zintle Zothe (216130565)
//  Date: 08 April 2022
// */
//
//import za.ac.cput.entity.Role;
//import java.util.HashSet;
//import java.util.Set;
//
//public class RoleRepository implements IRoleRepository {
//    private static RoleRepository repository =null;
//    private Set<Role> roleDB=null;
//
//
//    private RoleRepository(){
//        roleDB =new HashSet<Role>();
//    }
//
//
//    public static RoleRepository getRepository(){
//        if(repository==null){
//            repository=new RoleRepository();
//        }
//        return repository;
//    }
//
//    @Override
//    public Role create(Role role) {
//        boolean created=roleDB.add(role);
//        if(!created)
//            return null;
//        else
//            return role;
//    }
//
//    @Override
//    public Role read(String roleId) {
//        // reading using lambda expressions
//        Role role=this.roleDB.stream()
//                .filter(a ->a.getRoleId().equals(roleId))
//                .findAny()
//                .orElse(null);
//
//        return role;
//
//    }
//
//    @Override
//    public Role update(Role role) {
//        Role oldRole=read(role.getRoleId());
//        if(oldRole != null){
//            roleDB.remove(oldRole);
//            roleDB.add(role);
//            return role;
//
//        }
//        return null;
//    }
//
//    @Override
//    public boolean delete(String id) {
//        Role roleToDelete= read(id);
//        if(roleToDelete== null)
//            return false;
//        roleDB.remove(roleToDelete);
//        return true;
//    }
//
//    @Override
//    public Set<Role> getAll() {
//        return roleDB;
//    }
//
//
//}