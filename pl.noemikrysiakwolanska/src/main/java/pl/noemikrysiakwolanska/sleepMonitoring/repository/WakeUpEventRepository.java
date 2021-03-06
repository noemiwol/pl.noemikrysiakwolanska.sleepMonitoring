package pl.noemikrysiakwolanska.sleepMonitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.noemikrysiakwolanska.sleepMonitoring.domian.entity.WakeUpEventEntity;
@Repository
public interface WakeUpEventRepository extends JpaRepository<WakeUpEventEntity, Long> {
}
