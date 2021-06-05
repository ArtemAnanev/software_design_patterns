package behavioural.visitor;

interface Visitor {
    void visit(SportCar sportCar);
    void visit(Engine engine);
    void visit(Wheel wheel);
}
