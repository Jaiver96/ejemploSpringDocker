package ejemplo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {

    @GetMapping("/hola")
    public String getMessage()  {
        return "Hello, World";
    }

}