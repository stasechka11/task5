package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    void shouldCalculateVacationCount(int expected, int income, int expenses, int threshold) {
        VacationService vacationService = new VacationService();

        //  int expected = 2;
        int actual = vacationService.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
