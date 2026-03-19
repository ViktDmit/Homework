package ExerciseEight;

public class Person {
    private String fullName;
    private Integer age;

    public Person() {
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

