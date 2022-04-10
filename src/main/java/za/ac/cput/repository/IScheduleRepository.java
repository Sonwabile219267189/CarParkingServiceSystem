package za.ac.cput.repository;
/**
 * IScheduleRepository.java
 * Interface Class
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 9 April 2022
 */


import java.util.List;
import za.ac.cput.entity.Schedule;

public interface IScheduleRepository extends IRepository<Schedule, String>{
    public List<Schedule> getAll();
}
