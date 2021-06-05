package structural.decorator;

public class BlueCarDecorator extends CarDecorator{
    public BlueCarDecorator(Car decorated) {
        super(decorated);
    }

    @Override
    public void draw() {
        decorated.draw();
        setColor();
    }
    private void setColor(){
        System.out.println("Color: red");
    }
}
