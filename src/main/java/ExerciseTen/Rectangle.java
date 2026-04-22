package ExerciseTen;

import java.util.Objects;

public class Rectangle {

  private Integer width;
  private Integer height;

  public Rectangle(Integer width, Integer height) {
    setWidth(width);
    setHeight(height);
  }

  public Rectangle(Rectangle other) {
    if (other == null) {
      throw new IllegalArgumentException("Переданный объект Rectangle не может быть null");
    }
    this.width = other.width;
    this.height = other.height;
  }

  public Integer getWidth() {
    return width;
  }

  public Integer getHeight() {
    return height;
  }

  private void setWidth(Integer width) {
    this.width = width;
  }

  private void setHeight(Integer height) {
    this.height = height;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) obj;
    return Objects.equals(width, rectangle.width) &&
        Objects.equals(height, rectangle.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }

  @Override
  public String toString() {
    return "Rectangle{width=" + width + ", height=" + height + "}";
  }
}
