package ExerciseOne;

public class ExerciseOneLaunch {

  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Димасик";
    person1.age = 33;

    Person person2 = new Person();
    person2.name = "Костик";
    person2.age = 61;

    System.out.printf("Первый человек: имя = %s, возраст = %d%n", person1.name, person1.age);
    System.out.printf("Второй человек: имя = %s, возраст = %d%n", person2.name, person2.age);

    System.out.println();
  }

}
