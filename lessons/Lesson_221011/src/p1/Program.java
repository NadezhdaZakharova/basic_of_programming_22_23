package p1;

public class Program {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        System.out.printf("r1: square %f, perimeter %f\n", r1.square(), r1.perimeter());

        Rectangle r2 = new Rectangle(100);
        System.out.printf("r2: square %f, perimeter %f\n", r2.square(), r2.perimeter());

        Rectangle r3 = new Rectangle();
        System.out.printf("r3: square %f, perimeter %f\n", r3.square(), r3.perimeter());
    }
}
