package org.infoaxon;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter the type of operation you want to perform (+, -, *, /): ");
        String operation = sc.next();

        SimpleCalculator calc = new SimpleCalculator();
        int result = calc.performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }
}