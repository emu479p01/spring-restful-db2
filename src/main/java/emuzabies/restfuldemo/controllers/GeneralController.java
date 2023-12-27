package emuzabies.restfuldemo.controllers;

import emuzabies.restfuldemo.models.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {
    
    @GetMapping("/general/helloworld")
    public String getHelloWorld() {
        return "Hello, World!";
    }
    
    @PostMapping("/general/userinfo")
    public String setUserInfo(@RequestBody UserInfo userInfo) {
        return "Insert " + userInfo + " to DB.";
    }
}
