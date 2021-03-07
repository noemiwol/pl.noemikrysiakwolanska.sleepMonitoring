package pl.noemikrysiakwolanska.sleepMonitoring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.noemikrysiakwolanska.sleepMonitoring.domian.entity.SleepEventEntity;
import pl.noemikrysiakwolanska.sleepMonitoring.repository.SleepEventRepository;

@RestController
@RequiredArgsConstructor
public class SleepEventController {

    private final SleepEventRepository sleepEventRepository;

    @PostMapping("/sleepEvent")
    SleepEventEntity sleepEventList(@RequestBody SleepEventEntity sleepEventEntity){
        return sleepEventRepository.save(sleepEventEntity);
    }
}
