package pl.noemikrysiakwolanska.sleepMonitoring.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateTimeOfSleepDto {
    private Long timeOfSleepId;
    private LocalDate timeOfSleep;
    private String description;
}
