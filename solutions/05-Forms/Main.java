public class Main{
  public static void main(String[] args){
    Circle c = new Circle(123);
    Parallelogram p = new Parallelogram(123, 321);
    Quadrilateral q = new Quadrilateral(321, 123);
    Rectangle r = new Rectangle(123, 321);
    Square s = new Square(123);
    Triangle t = new Triangle(123, 123);
    System.out.println(c.getRadius());
    System.out.println(p.getWidth());
    System.out.println(q.getLength());
    System.out.println(r.getWidth());
    System.out.println(s.getNumberOfCorners());
    System.out.println(t.getHc());
  }
}
