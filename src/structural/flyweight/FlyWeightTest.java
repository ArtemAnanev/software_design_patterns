package structural.flyweight;

public class FlyWeightTest {
    public static void main(String[] args) {
        int rows = 5;
        Factory theFactory = new Factory(rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                theFactory.getFleiweight(i).report(j);
            }
            System.out.println();
        }
    }
}
