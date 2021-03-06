package pl.noemikrysiakwolanska.sleepMonitoring.domian.dto;

import java.time.LocalDateTime;

public class SleepEvent extends Event {
    public SleepEvent(Long id, LocalDateTime dateTime) {
        super(id, dateTime);
    }
}
