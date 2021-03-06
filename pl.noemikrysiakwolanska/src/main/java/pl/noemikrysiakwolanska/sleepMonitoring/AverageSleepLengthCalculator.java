package pl.noemikrysiakwolanska.sleepMonitoring;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.stream.Stream;

@AllArgsConstructor
public class AverageSleepLengthCalculator {

    @Autowired
    private LengthOfSleepCalcuralor lengthOfSleepCalculator;

    public Duration calculate(List<Event> events){

        var totalDuration = Duration.ZERO;
        for(int i = 0; i < events.stream().count() - 1; i++){

            var duration
                    = lengthOfSleepCalculator
                        .calculate(
                                events.get(i),
                                events.get(i+1));

            totalDuration = totalDuration.plus(duration);
        }

        return totalDuration.dividedBy(events.stream().count() - 1);
    }
}
