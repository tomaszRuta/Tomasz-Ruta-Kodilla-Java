package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator(33,66);

        calculator.add();
        int addingResult = calculator.add();

        if (calculator.add() == addingResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        calculator.substract();
        int substractionResult = calculator.substract();

        if (calculator.substract() == substractionResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
