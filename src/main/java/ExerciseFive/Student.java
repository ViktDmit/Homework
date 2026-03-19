package ExerciseFive;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public int getScholarship() {
        if (averageMark == 5.0) {
            return 2000;
        } else {
            return 1900;
        }
    }
}
