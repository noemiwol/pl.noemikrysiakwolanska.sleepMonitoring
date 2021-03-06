package pl.noemikrysiakwolanska.sleepMonitoring;

import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class LengthOfSleepCalcuralor {
    public Duration calculate(Event sleepEvent, Event wakeUpEvent){
        return Duration.between(sleepEvent.getDateTime(), wakeUpEvent.getDateTime());
    }
}
