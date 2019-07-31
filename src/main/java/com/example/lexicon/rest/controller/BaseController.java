package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.service.LexiconService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

    LexiconService service;

    @Autowired
    BaseController(LexiconService service) {
        this.service = service;
    }
}
