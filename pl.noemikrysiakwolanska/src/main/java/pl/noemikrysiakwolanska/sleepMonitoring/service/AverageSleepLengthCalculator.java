package pl.noemikrysiakwolanska.sleepMonitoring.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.noemikrysiakwolanska.sleepMonitoring.domian.dto.Event;
import pl.noemikrysiakwolanska.sleepMonitoring.domian.dto.SleepEvent;
import pl.noemikrysiakwolanska.sleepMonitoring.domian.dto.WakeUpEvent;

import java.time.Duration;
import java.util.List;

@AllArgsConstructor
@Service
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
