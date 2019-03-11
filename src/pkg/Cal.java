package pkg;

//import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Cal {
    private static Scanner sc = new Scanner(System.in);
    private int n;
    private int row;
    private int col;

    public int getRow() {
        System.out.println("Enter array's rows");
        row = sc.nextInt();
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        System.out.println("Enter array's cols");
        col = sc.nextInt();
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getNForFact() {
        System.out.println("Enter number for calculating factorial.");
        n = sc.nextInt();
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void calFact(int n) {
        int fact = 1, i = 1;
        while (i <= n) {
            fact *= i++;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
    }

    public void calPrime(int n, String[] args) {
        for (int i = 1; i <= n; ++i) {
            int numb = Integer.parseInt(args[i]);
            if (check(numb)) {
                System.out.println(numb);
            }
        }
    }

    private boolean check(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void calTemp(float f) {
        float c = 5f * (f - 32) / 9f;
        System.out.println("The given temperature in Celsius is : " + c);
    }

    public void calculateSumInArray(int n) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        System.out.println("Enter the element");
        for (int i = 0; i < n; ++i) {
            int m = sc.nextInt();
            arrList.add(m);
        }
        int sum = 0;
        for (int element : arrList) {
            sum += element;
        }
        System.out.println("Sum is : " + sum);
    }

    public void print2DArray(int row, int col) {
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
        System.out.println("Enter the element");
        for (int i = 0; i < row; ++i) {
            arrList.add(new ArrayList<Integer>());
            for (int j = 0; j < col; ++j) {
                int m = sc.nextInt();
                (arrList.get(i)).add(m);
            }
        }
        System.out.println("Print the elements");
        for (ArrayList<Integer> i : arrList) {
            System.out.println(i);
        }
    }
}
