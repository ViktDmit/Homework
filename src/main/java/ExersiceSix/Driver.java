package ExersiceSix;

public class Driver extends PersonDriver {
    private int drivingExperience;

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "ExersiceSix.Driver{" +
                "fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
