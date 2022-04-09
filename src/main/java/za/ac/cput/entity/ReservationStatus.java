/* CarParkingServiceSystem.java
 Entity for a Reservation Status Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 10 April 2022
 */

package za.ac.cput.entity;

import sun.security.provider.certpath.Builder;

public class ReservationStatus {

    //declaration of private fields
    private String reservationID;
    private boolean isComplete;


    //Creating a builder pattern for Subject
    public ReservationStatus(Builder builder) {
        this.reservationID = builder.reservationID;
        this.isComplete = builder.isComplete;
    }

    @Override
    public String toString() {
        return "ReservationStatus{" +
                "reservationID='" + reservationID + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }

    public static class Builder {

        private String reservationID;
        private boolean isComplete;

        public void setReservationID(String reservationID) {
            this.reservationID = reservationID;
        }

        public void setComplete(boolean complete) {
            isComplete = complete;
        }

        public ReservationStatus build() {
            return new ReservationStatus(this);
        }

        // copy constructor to creates an object using another object of the same Java class
        public Builder copy(ReservationStatus reservationStatus) {
            this.reservationID = reservationStatus.reservationID;
            this.isComplete = reservationStatus.isComplete;

            return this;
        }

        public ReservationStatus builder() {
            return build();
        }


        public String getReservationID() {
            return reservationID;
        }
    }
}

