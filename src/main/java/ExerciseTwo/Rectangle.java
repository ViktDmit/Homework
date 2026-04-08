package ExerciseTwo;

public class Rectangle {

  private double width;
  private double height;

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getArea() {
    return width * height;
  }

  public double getPerimeter() {
    return 2 * (width + height);
  }

  public void printInfo() {
    System.out.printf("Ширина: %.2f, Высота: %.2f, Площадь: %.2f, Периметр: %.2f%n",
        width, height, getArea(), getPerimeter());
  }
}

