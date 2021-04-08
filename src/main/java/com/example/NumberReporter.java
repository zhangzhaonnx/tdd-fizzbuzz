package com.example;

public class NumberReporter {
    public static String report(int number) {
        if (includeX(number, 3)) {
            return "Fizz";
        }

        StringBuilder result = new StringBuilder();
        if (dividedX(number, 3)) {
            result.append("Fizz");
        }
        if (dividedX(number, 5)) {
            result.append("Buzz");
        }
        if (dividedX(number, 7)) {
            result.append("Whizz");
        }

        return result.toString().isEmpty() ? String.valueOf(number) : result.toString();
    }

    private static boolean dividedX(int number, int x) {
        return number % x == 0;
    }

    private static boolean includeX(int number, int x) {
        return String.valueOf(number).contains(String.valueOf(x));
    }
}
