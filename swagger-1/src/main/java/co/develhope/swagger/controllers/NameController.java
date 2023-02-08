package co.develhope.swagger.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {
    @RequestMapping
    @ApiOperation(value = "hi", notes = "prints my name")
    public String nameReturn(){
        return "Andrea";
    }

}
