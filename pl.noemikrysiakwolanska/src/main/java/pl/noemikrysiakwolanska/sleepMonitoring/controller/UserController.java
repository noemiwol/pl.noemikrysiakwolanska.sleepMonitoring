package pl.noemikrysiakwolanska.sleepMonitoring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.noemikrysiakwolanska.sleepMonitoring.domian.entity.UserEntity;
import pl.noemikrysiakwolanska.sleepMonitoring.repository.UserRepository;
import pl.noemikrysiakwolanska.sleepMonitoring.service.UserService;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @PostMapping("/newUser")
    UserEntity registeredUser(@RequestBody UserEntity newUser){
        return userRepository.save(newUser);

    }


}
