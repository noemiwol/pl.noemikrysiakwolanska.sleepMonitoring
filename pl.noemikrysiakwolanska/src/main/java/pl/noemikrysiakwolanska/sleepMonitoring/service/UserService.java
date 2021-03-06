package pl.noemikrysiakwolanska.sleepMonitoring.service;


import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import pl.noemikrysiakwolanska.sleepMonitoring.repository.UserRepository;

import java.util.Optional;
import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;


}
