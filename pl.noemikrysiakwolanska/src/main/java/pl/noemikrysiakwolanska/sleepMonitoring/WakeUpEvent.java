package pl.noemikrysiakwolanska.sleepMonitoring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class WakeUpEvent extends Event{
    public WakeUpEvent(Long id, LocalDateTime dateTime) {
        super(id, dateTime);
    }
}
