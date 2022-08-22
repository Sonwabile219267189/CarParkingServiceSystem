/* CarParkingServiceSystem.java
 Entity for a Reservation Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 9 April 2022
 */
package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Reservation implements Serializable {

    //declaration of private fields
    @Id private String reservationID;
    private String parkingSpaceID;
    private String dateOfReservation;
    private ReservationStatus reservationStatus;



    //Creating a builder pattern for Subject
    public Reservation(Builder builder) {
        this.reservationID = builder.reservationID;
        this.parkingSpaceID = builder.parkingSpaceID;
        this.dateOfReservation = builder.dateOfReservation;
        this.reservationStatus = builder.reservationStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationID='" + reservationID + '\'' +
                ", parkingSpaceID='" + parkingSpaceID + '\'' +
                ", dateOfReservation='" + dateOfReservation + '\'' +
                ", reservationStatus='" + reservationStatus + '\'' +
                '}';
    }

    public static class Builder{
        private String reservationID;
        private String parkingSpaceID;
        private String dateOfReservation;
        private ReservationStatus reservationStatus;

        public Builder setReservationID(String reservationID) {
            this.reservationID = reservationID;
            return this;
        }

        public Builder setParkingSpaceID(String parkingSpaceID) {
            this.parkingSpaceID = parkingSpaceID;
            return this;
        }

        public Builder setDateOfReservation(String dateOfReservation) {
            this.dateOfReservation = dateOfReservation;
            return this;
        }

        public Builder setReservationStatus(ReservationStatus reservationStatus) {
            this.reservationStatus = reservationStatus;
            return this;
        }

        // copy constructor to creates an object using another object of the same Java class
        public Builder copy(Reservation reservation){

            this.reservationID = reservation.reservationID;
            this.parkingSpaceID = reservation.parkingSpaceID;
            this.dateOfReservation = reservation.dateOfReservation;
            this.reservationStatus = reservation.reservationStatus;

            return this;
        }

        public Reservation build() {
            return new Reservation(this);
        }
    }
    public String getReservationID() {
        return reservationID;
    }


}




