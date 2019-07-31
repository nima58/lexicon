package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.service.BaluchiEnglishService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

    BaluchiEnglishService service;

    @Autowired
    BaseController(BaluchiEnglishService service) {
        this.service = service;
    }
}
