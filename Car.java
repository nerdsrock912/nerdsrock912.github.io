// Good job finding this ultra secret file.

public class Car {
    
    private String make;
    private String model;
    private int year;
    
    public Car(String make, String model, int year) {
      this.make = make;
      this.model = model;
      this.year = year;
    }
    
    public void printStats() {
      System.out.println("Make: " + make);
      System.out.println("Model: " + model);
      System.out.println("Year: " + year);
    }
    
    @Override
    public String toString() {
      return String.format("%d %s %s\n", year, make, model);
    }
}
