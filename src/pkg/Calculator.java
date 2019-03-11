package pkg;

import checked.LessThanException;
import checked.DivideByZeroException;

public class Calculator {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int divisionUsingCheckedException() throws DivideByZeroException, LessThanException {
        if(x < 10) {
            throw new LessThanException("Numerator cannot be less than 10");
        }
        if(y == 0) {
            throw new DivideByZeroException("Denominator cannot be zero!");
        }
        return x/y;
    }

    public int divisionUsingUncheckedException(){
        int result = 0;
        try {
            if(x < 10) {
                throw new LessThanException("Numerator cannot be less than 10");
            }
            result = x/y;
        } catch (unchecked.DivideByZeroException e) {
            throw new unchecked.DivideByZeroException("Denominator should not be zero! in unchecked");
        } catch (LessThanException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
