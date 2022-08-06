/* CarParkingServiceSystem.java
 Entity for a Reservation Status Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 9 April 2022
 */

package za.ac.cput.entity;

public class ReservationStatus {

    //declaration of private fields
    private String reservationStatusID;
    private String reservationStatusDescription;


    //Creating a builder pattern for Subject
    public ReservationStatus(Builder builder) {
        this.reservationStatusID = builder.reservationStatusID;
        this.reservationStatusDescription = builder.reservationStatusDescription;
    }

    @Override
    public String toString() {
        return "ReservationStatus{" +
                "reservationStatusID='" + reservationStatusID + '\'' +
                ", reservationStatusDescription='" + reservationStatusDescription + '\'' +
                '}';
    }

    public static class Builder {

        private String reservationStatusID;
        private String reservationStatusDescription;

        public Builder setReservationStatusID(String reservationStatusID){
            this.reservationStatusID = reservationStatusID;
            return this;
        }

        public Builder setReservationStatusDescription(String reservationStatusDescription) {
            this.reservationStatusDescription = reservationStatusDescription;
            return this;
        }

        // copy constructor to creates an object using another object of the same Java class
        public Builder copy(ReservationStatus reservationStatus) {
            this.reservationStatusID = reservationStatus.reservationStatusID;
            this.reservationStatusDescription = reservationStatus.reservationStatusDescription;

            return this;
        }

        public ReservationStatus build() {
            return new ReservationStatus(this);
        }
    }
    public String getReservationStatusID() {
        return reservationStatusID;
    }
}

