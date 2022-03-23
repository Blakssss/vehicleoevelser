package pat;

public class Car extends Vehicle {

  void drive() {
    System.out.println("Car driving.");
  }

  void startEngine() {
    System.out.println("Car engine started.");
    super.startEngine();
    System.out.println(getEngineIsStarted());
  }
}
