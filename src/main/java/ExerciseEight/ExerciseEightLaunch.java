package ExerciseEight;

public class ExerciseEightLaunch {

  public static void main(String[] args) {
    ExerciseEight.Person person3 = new ExerciseEight.Person();

    ExerciseEight.Person person4 = new ExerciseEight.Person("Иван Петров", 25);

    System.out.println("Объект person3 (конструктор по умолчанию):");
    person3.move();
    person3.talk();

    System.out.println();

    System.out.println("Объект person4 (параметризованный конструктор):");
    person4.move();
    person4.talk();

    System.out.println();
  }

}
