 import java.util.*;

class Arithmetic {
    private double num1, num2;

    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double doAddition() {
        return num1 + num2;
    }

    public double doSubtraction() {
        return num1 - num2;
    }

    public double doMultiplication() {
        return num1 * num2;
    }

    public double doDivision() {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return num1 / num2;
    }
}

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        Arithmetic a = new Arithmetic();
        a.setNumbers(n1, n2);

        System.out.println("Addition = " + a.doAddition());
        System.out.println("Subtraction = " + a.doSubtraction());
        System.out.println("Multiplication = " + a.doMultiplication());
        System.out.println("Division = " + a.doDivision());
    }
}
