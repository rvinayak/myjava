package org.infoaxon;

import java.util.Scanner;
public class SimpleCalculator {

    public  int performOperation(int firstNumber, int secondNumber, String operation)
    {
        int result = 0;
        if (operation.equals("+")) {
            result = addition(firstNumber,secondNumber);
        }
        else if (operation.equals("-")) {
            result = subtraction(firstNumber,  secondNumber);
        }
        else if (operation.equals("*")) {
            result = multiplication(firstNumber,  secondNumber);
        }

        else if (operation.equals("/")) {
            result = division(firstNumber , secondNumber);
        }
        else {
            System.out.println("Invalid operation");
        }
        return result;
    }

    public int addition(int x, int y)
    {
        return x + y;
    }
    public int subtraction(int x, int y)
    {
        return x - y;
    }
    public int multiplication(int x, int y)
    {
        return x * y;
    }
    public int division(int x, int y)
    {
        return x / y;

    }

}