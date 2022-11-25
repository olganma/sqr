package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void testCountSqr(long lowLimitTest, long upLimitTest, int expected) {

        SQRService service = new SQRService();

        long actual = service.countSqr(lowLimitTest, upLimitTest);

        assertEquals(expected, actual);
    }
}

