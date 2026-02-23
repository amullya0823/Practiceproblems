import java.util.Scanner;

public class l3pp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary;
        double bonus;
        double income;

        // Input
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();

        // Calculation
        income = salary + bonus;

        // Output
        System.out.println("The salary is INR " + salary + 
                           " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + income);
    }
}