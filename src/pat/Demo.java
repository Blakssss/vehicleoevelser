package pat;

public class Demo {

  void go() {
    Vehicle v1 = new Vehicle();
    v1.startEngine();

    Car c1 = new Car();
    c1.startEngine();
    c1.drive();

    Ship s1 = new Ship();
    s1.startPropeller();
    s1.sail();
  }

  public static void main(String[] args) {
    new Demo().go();
  }
}
