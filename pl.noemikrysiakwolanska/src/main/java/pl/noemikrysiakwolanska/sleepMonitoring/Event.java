package pl.noemikrysiakwolanska.sleepMonitoring;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public abstract class Event {
    protected Long id;
    protected LocalDateTime dateTime;
}
