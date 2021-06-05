package structural.flyweight;

public class FlyWeight {
    private int row;
    public FlyWeight(int row) {
        this.row = row;
        System.out.println("ctoe: " + this.row);
    }
    void report(int col) {
        System.out.print(" " + row + col);
    }

}
