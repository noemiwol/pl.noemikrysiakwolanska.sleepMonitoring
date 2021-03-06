package pl.noemikrysiakwolanska.sleepMonitoring.domian.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class WakeUpEventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column
    protected LocalDateTime dateTime;
}
