package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.service.BaluchiEnglishService;
import com.example.lexicon.rest.utils.Statistics;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatisticsController extends BaseController {
    @Autowired
    StatisticsController(BaluchiEnglishService service) {
        super(service);
    }

    @ApiOperation(value = "View a list of available words", response = List.class)
    @GetMapping("/words/statistics")
    public Statistics showstatistics(){
        return null;
    }
}
