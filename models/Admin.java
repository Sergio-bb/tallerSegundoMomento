package models;

public class Admin extends Person {
    private String leader;
    private String parking;

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public Admin(String name, String indetification, int age, String leader, String parking) {
        super(name, indetification, age);
        this.leader = leader;
        this.parking = parking;
    }
}
