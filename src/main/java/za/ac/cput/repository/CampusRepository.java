/**
 * CampusRepository.java
 * Interface for other classes to extend
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.Campus;

import java.util.*;

public class CampusRepository implements ICampusRepository{

    public static CampusRepository repository = null;
    private List<Campus> campusDB = null;

    //singleton
    private CampusRepository(){
        campusDB = new ArrayList<>();

    }

    public static CampusRepository getRepository(){
        if (repository == null){
            repository = new CampusRepository();
        }
        return repository;
    }



    @Override
    public Campus create(Campus campus) {
        campusDB.add(campus);
        return campus;
    }

    @Override
    public Campus read(String campusID) {
        /*
        for(Campus campus :campusDB)
            if (campus.getCampusID().equals(campusID)) {
                return campus;
            }
            return null;
*/
         Campus campus = campusDB.stream()
                 .filter(c -> c.getCampusID().equals(campusID))
                 .findAny()
                 .orElse(null);
         return  campus;
    }

    @Override
    public Campus update(Campus campus) {
        Campus oldCampus = read(campus.getCampusID());
        if(oldCampus != null){
            campusDB.remove(oldCampus);
            campusDB.add(campus);
            return campus;
        }
        return null;
    }

    @Override
    public boolean delete(String campusID) {
        Campus campusDelete = read(campusID);
        if(campusDelete == null){
            return false;
        }
        campusDB.remove(campusDelete);
        return true;
    }

    @Override
    public List<Campus> getAll() {
        return campusDB;
    }
}
