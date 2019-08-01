package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.service.LexService;

public class BaseController {
    private LexService service;
    BaseController(LexService service){
        this.service = service;
    }
}
