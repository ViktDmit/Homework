package ExerciceNine;

public class ExerciseNineLaunch {

  public static void main(String[] args) {
    ExerciceNine.Car car1 = new ExerciceNine.Car("Toyota Camry", 2022);

    ExerciceNine.Car car2 = new ExerciceNine.Car(null, null);

    System.out.println("Информация о первом автомобиле:");
    System.out.println(car1);

    System.out.println();

    System.out.println("Информация о втором автомобиле (с null в конструкторе):");
    System.out.println(car2);

    System.out.println();
  }


}
