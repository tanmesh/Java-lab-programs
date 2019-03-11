import checked.DivideByZeroException;
import checked.LessThanException;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setX(sc.nextInt());
        calculator.setY(sc.nextInt());
        double result;
        System.out.println("Applying Check Exceptions....");
        try{
            result = calculator.divisionUsingCheckedException();
            System.out.println("Result is " + result);
        } catch (DivideByZeroException | LessThanException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Applying Uncheck Exceptions....");
        try {
            result = calculator.divisionUsingUncheckedException();
            System.out.println("Result is " + result);
        } catch (unchecked.DivideByZeroException e) {
            System.out.println(e.getMessage());
        }


    }
}

