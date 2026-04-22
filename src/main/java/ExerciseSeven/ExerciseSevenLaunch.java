package ExerciseSeven;

public class ExerciseSevenLaunch {

  public static void main(String[] args) {
    Phone phone1 = new Phone("123-45-67", "iPhone Z", 0.164);
    Phone phone2 = new Phone("987-65-43", "Samsung S25", 0.169);

    System.out.println("Информация о телефонах:");
    System.out.println(phone1);
    System.out.println(phone2);

    System.out.println("\nТест 1: phone1 звонит phone2");
    phone1.receiveCall(phone2);

    System.out.println("\nТест 2: phone1 звонит сам себе");
    phone1.receiveCall(phone1);

    System.out.println();
  }

}
