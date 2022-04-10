/*ScheduleFactoryTest.java
 * ScheduleFactory entity
 *Author : Hlombekazi Mbelu 209024666
 * Date 7 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import za.ac.cput.entity.Schedule;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleFactoryTest {

    Schedule schedule = ScheduleFactory.createSchedule(LocalDateTime.of(2022, 4, 7, 2 ,15 ) ,LocalDateTime.now());

        @Test
        public void scheduleTest(){
            Assertions.assertEquals(schedule, schedule);
            Assertions.assertSame(schedule,schedule);
        }

        @Test
        @Disabled
        public void disableTest(){
            Assertions.assertEquals(schedule, schedule);
        }

        @Test
        @Timeout(value = 1000)
        public void testTimeout(){
            Assertions.assertEquals(schedule, schedule);
        }


}