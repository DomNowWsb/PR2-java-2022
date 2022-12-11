package devices;

public class Car {
    final String producer;
    final String model;
    String colour;
    Double mileage;
    Boolean isEngineRunning;
    private Double value;

    public String toString(){
        return "Producer: " + producer + " Model: " + model + " Colour: " + colour + " Mileage: " + mileage;
    }
    public Car(String producer, String model, double value) {
        this.producer = producer;
        this.model = model;
        this.value = value;
    }
    public Double getValue(){
        return value;
    }
}
