/* CarParkingServiceSystem.java
 Entity for a Reservation Status Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 10 April 2022
 */

package za.ac.cput.entity;

public class ReservationStatus {

    //declaration of private fields
    private String reservationID;
    private String complete;


    //Creating a builder pattern for Subject
    public ReservationStatus(Builder builder) {
        this.reservationID = builder.reservationID;
        this.complete = builder.complete;
    }

    @Override
    public String toString() {
        return "ReservationStatus{" +
                "reservationID='" + reservationID + '\'' +
                ", complete=" + complete +
                '}';
    }

    public static class Builder {

        private String reservationID;
        private String complete;

        public Builder setReservationID(String reservationID) {
            this.reservationID = reservationID;
            return this;
        }

        public Builder setComplete(String complete) {
            this.complete = complete;
            return this;
        }

        // copy constructor to creates an object using another object of the same Java class
        public Builder copy(ReservationStatus reservationStatus) {
            this.reservationID = reservationStatus.reservationID;
            this.complete = reservationStatus.complete;

            return this;
        }

        public ReservationStatus build() {
            return new ReservationStatus(this);
        }

    }
}

