package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("To jest tekst1", tekst1 -> tekst1.toUpperCase()));
        System.out.println(poemBeautifier.beautify("To jest tekst2", tekst2 -> tekst2.substring(3, tekst2.length()-1)));
        System.out.println(poemBeautifier.beautify("TO JEST DUZY TEKST3", tekst3 -> tekst3.toLowerCase()));
        System.out.println(poemBeautifier.beautify("To jest tekst4", tekst4 -> tekst4.replace("ks", "sss")));
        System.out.println(poemBeautifier.beautify("To jest tekst5", tekst5 -> tekst5.replace(tekst5, "123 " + tekst5 + " 321")));

    }
}