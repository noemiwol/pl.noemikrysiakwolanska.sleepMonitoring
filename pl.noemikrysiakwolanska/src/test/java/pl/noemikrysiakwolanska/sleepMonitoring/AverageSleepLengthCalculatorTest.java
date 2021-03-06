package pl.noemikrysiakwolanska.sleepMonitoring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AverageSleepLengthCalculatorTest {

    @Test
    void calculate() {

        //Given
        var input = new ArrayList<Event>();
        input.add(new SleepEvent(0L, LocalDateTime.of(2021, 3,6, 16, 0)));
        input.add(new WakeUpEvent(1L, LocalDateTime.of(2021, 3, 7, 8, 0)));

        var sut = new AverageSleepLengthCalculator(new LengthOfSleepCalcuralor());

        //When
        var result = sut.calculate(input);

        //Then
        assertEquals(result, Duration.ofHours(16) );

    }
}