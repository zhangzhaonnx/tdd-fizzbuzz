package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberReporterTest {

    @Test
    public void should_return_same_number_when_report_given_normal_number() {
        assertEquals(NumberReporter.report(1), "1");
    }
}