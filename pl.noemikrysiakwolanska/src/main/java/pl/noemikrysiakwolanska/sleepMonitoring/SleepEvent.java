package pl.noemikrysiakwolanska.sleepMonitoring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class SleepEvent extends Event{
    public SleepEvent(Long id, LocalDateTime dateTime) {
        super(id, dateTime);
    }
}
