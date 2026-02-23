import java.util.Scanner;

public class l3pp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheitResult;

        // Input
        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();

        // Formula
        fahrenheitResult = (celsius * 9/5) + 32;

        // Output
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }
}