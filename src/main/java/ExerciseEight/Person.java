package ExerciseEight;

public class Person {

  private final String fullName;
  private final Integer age;

  public Person() {
    this("default", 0);
  }


  public Person(String fullName, Integer age) {
    this.fullName = fullName;
    this.age = age;
  }

  public void move() {
    System.out.println(fullName + " движется");
  }

  public void talk() {
    System.out.println(fullName + ", возраст " + age + " говорит");
  }
}

