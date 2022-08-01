/**
 * Campus.java
 * Entity for Campus
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 5 April 2022
 */
package za.ac.cput.entity;

public class Campus {
    private String campusID;
    private String campusName;
    private String campusLocation;

    public String getCampusID() {
        return campusID;
    }

    public String getCampusName() {
        return campusName;
    }

    public String getCampusLocation() {
        return campusLocation;
    }

    private Campus(Builder builder){
        this.campusID = builder.campusID;
        this.campusName = builder.campusName;
        this.campusLocation = builder.campusLocation;
    }

    @Override
    public String toString() {
        return "Campus{" +
                "campusID='" + campusID + '\'' +
                ", campusName='" + campusName + '\'' +
                ", campusLocation='" + campusLocation + '\'' +
                '}';
    }

    public static class Builder{
        private String campusID;
        private String campusName;
        private String campusLocation;

        public Builder setCampusID(String campusID){
            this.campusID = campusID;
            return this;
        }

        public Builder setCampusName(String campusName){
            this.campusName = campusName;
            return this;
        }

        public Builder setCampusLocation(String campusLocation){
            this.campusLocation = campusLocation;
            return this;
        }

        public Builder copy(Campus campus){
            this.campusID = campus.campusID;
            this.campusName = campus.campusName;
            this.campusLocation = campus.campusLocation;
            return this;

        }

        public Campus build(){
            return new Campus(this);
        }
    }
}
