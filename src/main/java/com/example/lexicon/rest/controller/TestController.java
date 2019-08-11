package com.example.lexicon.rest.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@Api(value="onlinelexicon", description="Operations pertaining to names in Online lexicon")
public class TestController {

    @GetMapping("/hello")
    public List<String> sayHello(){
        List<String> items = new ArrayList<>();
        items.add("Hello World");
        items.add("Greetings from Baluchi English Lexicon");
        return items;
    }
}
