import java.util.Scanner;
import java.io.*;
public class Calculator {
    Scanner sc = new Scanner(System.in);
    double input1, input2, result;
    public Calculator() {


        System.out.println("Enter first number");
        input1 = sc.nextDouble();
        System.out.println("Enter second number");
        input2 = sc.nextDouble();
    }

    public void add() {
        result = input1 + input2;
        System.out.println("The result is: " + result);
    }
    public void subtract() {
            result = input1 - input2;
            System.out.println("The result is: " + result);
    }
    public void multiply() {
        result = input1 * input2;
        System.out.println("The result is: " + result);
    }
    public void divide() {
        try {
            result = input1 / input2;
            System.out.println("The result is: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
