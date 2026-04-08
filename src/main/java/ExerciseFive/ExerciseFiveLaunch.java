package ExerciseFive;

public class ExerciseFiveLaunch {

  public static void main(String[] args) {
    Student student = new Student();
    student.firstName = "Вася";
    student.lastName = "Пупкин";
    student.group = "АТ-09";
    student.averageMark = 4.5;

    System.out.println("Имя: " + student.firstName);
    System.out.println("Фамилия: " + student.lastName);
    System.out.println("Группа: " + student.group);
    System.out.println("Средняя оценка: " + student.averageMark);
    System.out.println("Стипендия: " + student.getScholarship() + " руб.");
    System.out.println();

    Aspirant aspirant = new Aspirant();
    aspirant.firstName = "Петя";
    aspirant.lastName = "Жупкин";
    aspirant.group = "АТ-08";
    aspirant.averageMark = 5.0;
    aspirant.scientificWork = "Почему Мосгаз невоспитанные хамло";

    System.out.println("Имя: " + aspirant.firstName);
    System.out.println("Фамилия: " + aspirant.lastName);
    System.out.println("Группа: " + aspirant.group);
    System.out.println("Средняя оценка: " + aspirant.averageMark);
    System.out.println("Научная работа: " + aspirant.scientificWork);
    System.out.println("Стипендия: " + aspirant.getScholarship() + " руб.");
    System.out.println();

    System.out.println();
  }

}
