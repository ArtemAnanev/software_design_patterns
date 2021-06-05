package creational.builder;

public class Car {
    public void buildBase() {
        print("Делаем корпус");
    }
    public void buildWheels() {
        print("Ставим колесo");
    }
    public void buildEngine(Engine engine) {
        print("Ставим движок: " + engine.getEngineType());
    }
    private void print(String msg) {
        System.out.println(msg);
    }
}
