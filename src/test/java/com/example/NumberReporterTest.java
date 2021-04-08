package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberReporterTest {

    @Test
    public void should_return_same_number_when_report_given_normal_number() {
        assertEquals(NumberReporter.report(1), "1");
    }

    @Test
    public void should_return_fizz_when_report_given_number_divided_3() {
        assertEquals(NumberReporter.report(3), "Fizz");
    }

    @Test
    public void should_return_buzz_when_report_given_number_divided_5() {
        assertEquals(NumberReporter.report(5), "Buzz");
    }

    @Test
    public void should_return_whizz_when_report_given_number_divided_7() {
        assertEquals(NumberReporter.report(7), "Whizz");
    }

    @Test
    public void should_return_fizzbuzz_when_report_given_number_divided_3_and_5() {
        assertEquals(NumberReporter.report(15), "FizzBuzz");
    }

    @Test
    public void should_return_fizzwhizz_when_report_given_number_divided_3_and_7() {
        assertEquals(NumberReporter.report(21), "FizzWhizz");
    }

    @Test
    public void should_return_buzzwhizz_when_report_given_number_divided_5_and_7() {
        assertEquals(NumberReporter.report(35), "BuzzWhizz");
    }
}