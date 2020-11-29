package exercise9;

public class Ellipse {
  private Point startPoint;
  private double height;
  private double width;

  public Ellipse() {
    startPoint = new Point (0, 0);
    height = 1;
    width = 1;
  }

  public Ellipse(Point startPoint, double height, double width) {
    startPoint = new Point(startPoint);
    this.height = height;
    this.width = width;
  }

  public Ellipse(Ellipse otherEllipse) {
    this.startPoint = new Point(otherEllipse.startPoint);
    this.height = otherEllipse.height;
    this.width = otherEllipse.width;
  }

  public boolean isValid(){
    return height > 0 && width > 0;
  }

  public initialize() {
    do {
      startPoint.initialize();
      this.height = Utils.INPUT.nextDouble;
      this.width = Utils.INPUT.nextDouble;
    } while (!isValid())
  }

  public double calculatePerimeter(){
  return Math.PI * (3 * (height + width) - Math.sqrt(3 * height + width)(3 * width + height));
  }

  public double calculateArea() {
    return Math.PI * height * width;
  }

  public String getType() {
    return (Utils.equals(height, width) ? "Circle" : "Ellipse");
  }

  public String toString() {
    return ("%s-[%s, %s], %s, P=%s, A=%s", startPoint, height, width, calculatePerimeter(), calculateArea());
  }

  public boolean equals(Ellipse otherEllipse) {
    boolean a = Utils.equals(this.height, otherEllipse.height);
    boolean b = Utils.equals(this.width, otherEllipse.width);
    boolean c = Utils.equals(this.height, otherEllipse.width);
    boolean d = Utils.equals(this.width, otherEllipse.height);

    return ((a && b) || (c && d));

  }
}
