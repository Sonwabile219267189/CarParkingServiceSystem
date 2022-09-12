/*Schedule.java
 * Schedule entity
 *Author : Hlombekazi Mbelu 209024666
 * Date 7 April 2022
 */
package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
@Entity
public class Schedule implements Serializable {

    @Id
    private String userId;
    private String vehicleId;
    private String scheduleId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    protected Schedule(){}

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    private Schedule(Schedule.Builder builder)
    {
        this.userId =  builder.userId;
        this.vehicleId = builder.vehicleId;
        this.scheduleId = builder.scheduleId;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "userId='" + userId + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", scheduleId=" + scheduleId + '\''+
                ", startTime=" + startTime + '\''+
                ", endTime=" + endTime + '\''+
                '}';
    }

    public String getScheduleID() {
        return scheduleId;
    }

    public static class Builder {

        private String userId;
        private String vehicleId;
        private String scheduleId;
        private LocalDateTime startTime;
        private LocalDateTime endTime;

        public Builder seUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setVehicleId(String VehicleId) {
            this.vehicleId = VehicleId;
            return this;
        }

        public Builder setScheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }

        public Builder setStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(LocalDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder copy(Schedule schedule) {
            this.userId = schedule.userId;
            this.vehicleId = schedule.vehicleId;
            this.scheduleId = schedule.scheduleId;
            this.startTime = schedule.startTime;
            this.endTime = schedule.endTime;
            return this;
        }

        public Schedule build() {
            return new Schedule(this);
        }
    }
}
