package pl.noemikrysiakwolanska.sleepMonitoring.service;

import org.springframework.stereotype.Service;
import pl.noemikrysiakwolanska.sleepMonitoring.domian.dto.Event;

import java.time.Duration;

@Service
public class LengthOfSleepCalcuralor {
    public Duration calculate(Event sleepEvent, Event wakeUpEvent){
        return Duration.between(sleepEvent.getDateTime(), wakeUpEvent.getDateTime());
    }
}
