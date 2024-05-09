package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class restServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataset.csv")
    public void shouldShowResultOnFirstDataSet(int income, int expenses, int threshold, int expected) {

        restService service = new restService();
        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        //int expected = 3;

        int actual = service.vacationCalc(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    //   @Test
    //   void shouldShowResultOnSecondDataSet() {

    //       restService service = new restService();
    //       int income = 100_000;
    //       int expenses = 60_000;
    //       int threshold = 150_000;
    //       int expected = 2;

    //       int actual = service.vacationCalc(income, expenses, threshold);

    //       Assertions.assertEquals(expected, actual);

    //   }
}
