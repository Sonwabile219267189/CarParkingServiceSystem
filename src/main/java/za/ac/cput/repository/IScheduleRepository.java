package za.ac.cput.repository;
/**
 * IScheduleRepository.java
 * Interface Class
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 9 April 2022
 */


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Schedule;
@Repository
public interface IScheduleRepository extends JpaRepository<Schedule, String> {
    public List<Schedule> getAll();
}
