package pat;

public class Vehicle {
  private boolean engineIsStarted = false;

  void startEngine() {
    engineIsStarted = true;
    System.out.println("Engine started.");
  }

  boolean getEngineIsStarted() {
    return engineIsStarted;
  }
}
