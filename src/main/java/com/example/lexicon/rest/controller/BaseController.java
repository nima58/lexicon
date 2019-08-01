package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.service.LexiconService;
import com.example.lexicon.rest.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {
    @Autowired
    LexiconService service;
    @Autowired
    StatisticsService statisticsService;

}
