/* CarParkingServiceSystem.java
 Entity for a Reservation Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 10 April 2022
 */
package za.ac.cput.entity;

import sun.security.provider.certpath.Builder;

public class Reservation {
    //declaration of private fields
    private String parkingLotID;
    private String parkingSpaceID;
    private String scheduleID;
    private String vehicleID;
    private String userName;
    private String dateOfReservation;
    private String reservationID;
    private String userID;


    //Creating a builder pattern for Subject
    public Reservation(Builder builder) {
        this.parkingLotID = builder.parkingLotID;
        this.parkingSpaceID = builder.parkingSpaceID;
        this.scheduleID = builder.scheduleID;
        this.vehicleID = builder.vehicleID;
        this.userName = builder.userName;
        this.dateOfReservation = builder.dateOfReservation;
        this.reservationID = builder.reservationID;
        this.userID = builder.userID;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "parkingLotID='" + parkingLotID + '\'' +
                ", parkingSpaceID='" + parkingSpaceID + '\'' +
                ", scheduleID='" + scheduleID + '\'' +
                ", vehicleID='" + vehicleID + '\'' +
                ", userName='" + userName + '\'' +
                ", dateOfReservation='" + dateOfReservation + '\'' +
                ", reservationID='" + reservationID + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }

    public static class Builder{

        private String parkingLotID;
        private String parkingSpaceID;
        private String scheduleID;
        private String vehicleID;
        private String userName;
        private String dateOfReservation;
        private String reservationID;
        private String userID;

        public void setParkingLotID(String parkingLotID) { this.parkingLotID = parkingLotID; }

        public void setParkingSpaceID(String parkingSpaceID) { this.parkingSpaceID = parkingSpaceID; }

        public void setScheduleID(String scheduleID) { this.scheduleID = scheduleID; }

        public void setVehicleID(String vehicleID) { this.vehicleID = vehicleID; }

        public void setUserName(String userName) { this.userName = userName; }

        public void setDateOfReservation(String dateOfReservation) { this.dateOfReservation = dateOfReservation; }

        public void setReservationID(String reservationID) { this.reservationID = reservationID; }

        public void setUserID(String userID) { this.userID = userID; }

        public Reservation build(){
            return new Reservation(this);
        }
        // copy constructor to creates an object using another object of the same Java class
        public Builder copy(Reservation reservation){
            this.parkingLotID = reservation.parkingLotID;
            this.parkingSpaceID = reservation.parkingSpaceID;
            this.scheduleID = reservation.scheduleID;
            this.vehicleID = reservation.vehicleID;
            this.userName = reservation.userName;
            this.dateOfReservation = reservation.dateOfReservation;
            this.reservationID = reservation.reservationID;
            this.userID = reservation.userID;

            return this;
        }

        public Reservation builder() {
            return build();
        }
    }

    public String getReservationID() {
        return reservationID;
    }

}




