public class Rectangle {
  public int length;
  public int width;

  public Rectangle(int length1, int width1) {
    this.length = length1;
    this.width = width1;
  }

  public int getArea() {
    return length * width;
  }

  public int getPerimeter() {
    return 2 * (length + width);
  }
}
