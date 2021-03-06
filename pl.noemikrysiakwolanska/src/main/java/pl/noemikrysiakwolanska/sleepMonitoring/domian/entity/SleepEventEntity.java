package pl.noemikrysiakwolanska.sleepMonitoring.domian.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class SleepEventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column
    protected LocalDateTime dateTime;
}
