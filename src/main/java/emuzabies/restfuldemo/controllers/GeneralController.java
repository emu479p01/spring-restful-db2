package emuzabies.restfuldemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {
    
    @GetMapping("/general/helloworld")
    public String getHelloWorld() {
        return "Hello, World!";
    }
}
