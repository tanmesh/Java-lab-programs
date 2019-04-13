package pkg;

import checked.LessThanException;
import unchecked.DivideByZeroException;

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

    public int division() throws LessThanException {
        int res;
        try {
            if(x < 10) {
                throw new LessThanException("Numerator should not be less than 10");
            }
            res = x/y;
        } catch (DivideByZeroException e) {
            throw new DivideByZeroException("Denominator should not be zero! in unchecked");
        }
        return res;
    }
}
