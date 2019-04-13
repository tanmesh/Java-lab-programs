import checked.LessThanException;
import pkg.Calculator;

import java.util.Scanner;

class MyThread extends Thread {
    private static Scanner sc = new Scanner(System.in);
    private final Calculator calculator;
    private String str;

    MyThread(Calculator calculator, String name) {
        this.calculator = calculator;
        this.str = name;
    }

    public void run() {
        synchronized(calculator) {
            if(str.equals("x")) {
                System.out.println("Enter X value");
                calculator.setX(sc.nextInt());
            } else if(str.equals("y")) {
                System.out.println("Enter Y value");
                calculator.setY(sc.nextInt());
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Thread t1 = new MyThread(calculator, "x");
        Thread t2 = new MyThread(calculator, "y");

        t1.start();
        t2.start();

        int result;
        try{
            System.out.println("X thread has started");
            t1.join();
            System.out.println("Y thread has started");
            t2.join();
            result = calculator.division();
            System.out.println("Result is " + result);
        } catch (LessThanException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}