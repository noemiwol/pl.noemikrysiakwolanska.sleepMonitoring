package pl.noemikrysiakwolanska.sleepMonitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.noemikrysiakwolanska.sleepMonitoring.domian.entity.SleepEventEntity;
@Repository
public interface SleepEventRepository extends JpaRepository<SleepEventEntity, Long> {
}
