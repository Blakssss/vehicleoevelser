package pat;

public class Ship extends Vehicle {

  void sail(){
    System.out.println("Ship is sailing.");
  }
  void startPropeller(){
    System.out.println("Ship propeller started.");
    super.startEngine();
    System.out.println(getEngineIsStarted());

  }
}
