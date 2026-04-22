package ExerciseTen;

public class ExerciseTenLaunch {

  public static void main(String[] args) {
    ExerciseTen.Rectangle rect3 = new ExerciseTen.Rectangle(5, 10);

    ExerciseTen.Rectangle rect4 = new ExerciseTen.Rectangle(rect3);

    System.out.println("Первый прямоугольник: " + rect3);
    System.out.println("Второй прямоугольник (копия): " + rect4);

    System.out.println("rect3 == rect4? " + (rect3 == rect4));
    System.out.println("rect3.equals(rect4)? " + rect3.equals(rect4));

    System.out.println();
  }

}
