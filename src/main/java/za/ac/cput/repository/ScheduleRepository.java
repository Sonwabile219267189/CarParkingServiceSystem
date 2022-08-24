//package za.ac.cput.repository;
///**
// * PaymentRepository.java
// * Interface class
// * Author: Hlombekazi Mbelu (209024666)
// * Date: 9 April 2022
// */
//
//
//import za.ac.cput.entity.Campus;
//import za.ac.cput.entity.Payment;
//import za.ac.cput.entity.Schedule;
//
//import java.util.*;
//
//public class ScheduleRepository implements IScheduleRepository {
//
//    public static ScheduleRepository repository = null;
//    private List<Schedule> scheduleDB = null;
//
//
//    private ScheduleRepository() {
//        scheduleDB = new ArrayList<>();
//
//    }
//
//    public static ScheduleRepository getRepository() {
//        if (repository == null) {
//            repository = new ScheduleRepository();
//        }
//        return repository;
//    }
//
//    @Override
//    public List<Schedule> getAll() {
//        return scheduleDB;
//    }
//
//    @Override
//    public Schedule create(Schedule schedule) {
//        scheduleDB.add(schedule);
//        return schedule;
//    }
//
//    @Override
//    public Schedule read(String s) {
//        for(Schedule schedule :scheduleDB)
//            if(schedule.getScheduleID().equals(s)){
//                return schedule;
//
//            }
//        return null;
//    }
//
//    @Override
//    public Schedule update(Schedule schedule) {
//        Schedule oldSchedule = read(schedule.getScheduleID());
//        if(oldSchedule != null){
//            scheduleDB.remove(oldSchedule);
//            scheduleDB.add(schedule);
//            return schedule;
//        }
//        return null;
//    }
//
//    @Override
//    public  boolean delete(String s) {
//        Schedule scheduleDelete = read(s);
//        if(scheduleDelete == null){
//            return false;
//        }
//        scheduleDB.remove(scheduleDelete);
//        return true;
//    }
//
//}
