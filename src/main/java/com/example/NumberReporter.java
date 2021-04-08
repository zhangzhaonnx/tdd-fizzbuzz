package com.example;

public class NumberReporter {
    public static String report(int number) {
        if (String.valueOf(number).contains("3")) {
            return "Fizz";
        }

        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return "FizzBuzzWhizz";
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0 && number % 7 == 0) {
            return "FizzWhizz";
        }

        if (number % 5 == 0 && number % 7 == 0) {
            return "BuzzWhizz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        if (number % 7 == 0) {
            return "Whizz";
        }

        return String.valueOf(number);
    }
}
