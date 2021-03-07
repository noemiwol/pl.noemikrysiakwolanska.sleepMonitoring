package pl.noemikrysiakwolanska.sleepMonitoring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.noemikrysiakwolanska.sleepMonitoring.domian.entity.WakeUpEventEntity;
import pl.noemikrysiakwolanska.sleepMonitoring.repository.WakeUpEventRepository;

@RestController
@RequiredArgsConstructor
public class WakeUpEventController {

    private final WakeUpEventRepository wakeUpEventRepository;

    @PostMapping("/WakeUpEvent")
    WakeUpEventEntity wakeUpEventEntity(@RequestBody WakeUpEventEntity wakeUpEventEntity){
        return wakeUpEventRepository.save(wakeUpEventEntity);
    }
}
