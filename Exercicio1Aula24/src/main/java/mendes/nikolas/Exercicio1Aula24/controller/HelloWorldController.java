package mendes.nikolas.Exercicio1Aula24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the system";
    }

}
