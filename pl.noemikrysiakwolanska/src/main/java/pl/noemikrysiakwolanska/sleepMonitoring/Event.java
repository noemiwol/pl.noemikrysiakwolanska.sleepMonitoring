package pl.noemikrysiakwolanska.sleepMonitoring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Component
public abstract class Event {
    protected Long id;
    protected LocalDateTime dateTime;
}
