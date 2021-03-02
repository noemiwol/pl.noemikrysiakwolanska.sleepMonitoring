package pl.noemikrysiakwolanska.sleepMonitoring.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DeleteTimeOfAwakeningDto {
    private Long timeOfAwakeningId;
    private LocalDate timeOfAwakening;
    private String description;
}
