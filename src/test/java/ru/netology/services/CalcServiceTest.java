package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceTest {
    @Test
    public void testCalculateMonth() {
        CalcService service = new CalcService();
        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ru.netology.services/inputdata.csv")
    public void testData(int income, int expenses, int threshold, int expected) {
        CalcService service = new CalcService();
        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);

    }
}