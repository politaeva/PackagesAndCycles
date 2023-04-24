package ru.netology.gamid.PackagesAndCycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;


public class CalculateTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/relax.csv")
    void vacationCalculation(int expected, int income, int expenses, int threshold) {
        Calculate service = new Calculate();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}

