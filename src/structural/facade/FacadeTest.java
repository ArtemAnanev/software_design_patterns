package structural.facade;

public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startCar();
        facade.stopCar();
        System.out.println();
        facade.stopCar();
    }
}
