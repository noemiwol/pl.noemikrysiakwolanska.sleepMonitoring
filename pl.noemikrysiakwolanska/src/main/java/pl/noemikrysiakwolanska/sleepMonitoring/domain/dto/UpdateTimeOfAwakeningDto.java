package pl.noemikrysiakwolanska.sleepMonitoring.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateTimeOfAwakeningDto {
    private Long timeOfAwakeningId;
    private LocalDate timeOfAwakening;
    private String description;
}
