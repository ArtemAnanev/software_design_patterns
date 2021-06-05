package structural.composite;

public class UnknownCar implements Car{
    @Override
    public void draw(String color) {
        System.out.println("Unknowncar color: " + color);
    }
}
