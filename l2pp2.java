import java.util.Scanner;

public class l2pp2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base, height;

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        double areaCm = 0.5 * base * height;

        // convert cm to inches
        double baseIn = base / 2.54;
        double heightIn = height / 2.54;
        double areaIn = 0.5 * baseIn * heightIn;

        System.out.println("The Area of the triangle in sq in is " + areaIn +
                           " and sq cm is " + areaCm);
    }
}