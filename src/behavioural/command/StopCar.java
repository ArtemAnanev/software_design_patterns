package behavioural.command;

public class StopCar {
    Car car;
    public StopCar(Car car) {
        this.car = car;
    }
    public void execute() {
        car.stopEngine();
    }
}
