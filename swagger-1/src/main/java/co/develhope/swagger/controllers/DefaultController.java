package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
    @RequestMapping
    public String welcome(){
        return "welcome in localhost:1234";
    }
}
