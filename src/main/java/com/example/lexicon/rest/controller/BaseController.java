package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.service.LexService;

public abstract class BaseController implements ControllerApi{
    //TODO param validation farsi/urdu trim
    private LexService service;
    BaseController(LexService service){
        this.service = service;
    }

    public LexService getService() {
        return service;
    }
}
