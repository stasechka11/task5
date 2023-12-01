package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    void shouldCalculateVacationCount() {
        VacationService vacationService = new VacationService();

        int expected = 2;
        int actual = vacationService.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
