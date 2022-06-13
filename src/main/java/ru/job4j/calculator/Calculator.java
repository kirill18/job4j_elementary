package ru.job4j.calculator;

public class Calculator {

    private static int x = 100;

        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            int result = calculator.sum(10);
            System.out.println(result);
            result = minus(110);
            System.out.println(result);
            result = calculator.sumAllOperation(5);
            System.out.println(result);
        }

        public static int minus(int a) {
            return a - x;
        }

        public int divide(int a) {
            return a / x;
        }

         public int sum(int a) {
             return a + x;
        }

        public int multiply(int a) {
             return a * x;
        }

        public int sumAllOperation(int a) {
            return minus(a) + sum(a) + divide(a) + multiply(a);
    }
}
