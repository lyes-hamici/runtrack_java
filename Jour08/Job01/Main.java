package Jour08.Job01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1 :");
        Rectangle rect1 = new Rectangle(12.5, 4.0);
        System.out.println(rect1);
        System.out.println();

        System.out.println("Test 2 :");
        RectangleColore rect2 = new RectangleColore(12.5, 4.0, "rouge");
        System.out.println(rect2);
        System.out.println();

        System.out.println("Test 3 :");
        RectangleColore rect3 = new RectangleColore(12.5, 4.0, "rouge");
        System.out.println(rect2.equals(rect3));
        System.out.println(rect1.equals(rect2));
        System.out.println(rect2.equals(null));
        System.out.println(rect2.equals(new String("rouge")));
    }
}
