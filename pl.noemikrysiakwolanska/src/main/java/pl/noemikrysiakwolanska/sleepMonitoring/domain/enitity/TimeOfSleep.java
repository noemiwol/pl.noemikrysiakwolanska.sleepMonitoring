package pl.noemikrysiakwolanska.sleepMonitoring.domain.enitity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SLEEP")
public class TimeOfSleep {
}
