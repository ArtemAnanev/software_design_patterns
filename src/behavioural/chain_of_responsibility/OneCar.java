package behavioural.chain_of_responsibility;

public class OneCar extends Car{

    @Override
    public void startEngine() {
        System.out.println("Start engine.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Stop engine.");
    }
}
