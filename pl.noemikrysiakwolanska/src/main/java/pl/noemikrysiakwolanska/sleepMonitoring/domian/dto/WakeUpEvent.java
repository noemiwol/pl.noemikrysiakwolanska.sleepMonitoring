package pl.noemikrysiakwolanska.sleepMonitoring.domian.dto;

import java.time.LocalDateTime;

public class WakeUpEvent extends Event {
    public WakeUpEvent(Long id, LocalDateTime dateTime) {
        super(id, dateTime);
    }
}
