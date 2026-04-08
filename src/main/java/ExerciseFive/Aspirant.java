package ExerciseFive;

final public class Aspirant extends Student {

  public String scientificWork;

  @Override
  public int getScholarship() {
    if (averageMark == 5.0) {
      return 2500;
    } else {
      return 2200;
    }
  }
}
