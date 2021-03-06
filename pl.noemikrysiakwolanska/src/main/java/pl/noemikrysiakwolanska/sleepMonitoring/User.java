package pl.noemikrysiakwolanska.sleepMonitoring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {
    private Long id;
    private String login;
    private String password;
}
