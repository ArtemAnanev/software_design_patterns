package structural.decorator;

abstract class CarDecorator implements Car{
    protected Car decorated;
    public CarDecorator(Car decorated){
        this.decorated = decorated;
    }

    @Override
    public void draw() {
        decorated.draw();
    }
}
