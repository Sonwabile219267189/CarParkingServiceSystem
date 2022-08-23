package za.ac.cput.repository;
/**
 * ScheduleRepositoryTest.java
 * Interface test class
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 9 April 2022
 * */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Schedule;
import za.ac.cput.factory.ScheduleFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class ScheduleRepositoryTest {
    public static IScheduleRepository scheduleRepository;
    Schedule schedule = ScheduleFactory.createSchedule(LocalDateTime.of(2022, 4, 7, 2 ,15 ) ,LocalDateTime.now());


    @Test
    void a_getAll() {
        System.out.println("Show all : ");
        System.out.println(scheduleRepository.getAll());
    }

    @Test
    void b_create() {
        Schedule created = scheduleRepository.save(schedule);
        assertNotNull(created);
        System.out.println("Create : " + created);
    }

    @Test
    void c_read() {
        Schedule read = scheduleRepository.save(schedule);
        assertNull(read);
        System.out.println("Read : " + read);
    }

    @Test
    void d_update() {
        Schedule updated = new Schedule.Builder().copy(schedule).build();
        assertNull(scheduleRepository.save(updated));
        System.out.println("Update : " + updated);
    }

    @Test
    void e_delete() {
        Schedule delete = scheduleRepository.save(schedule);

        scheduleRepository.deleteAll();
        System.out.println(scheduleRepository.findAll());
    }
}