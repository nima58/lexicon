package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.service.BccLexService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@Api(value="onlinelexicon", description="Operations pertaining to names in Online lexicon")
public class BaluchiController extends BaseController{

    private BccLexService service;

    @Autowired
    BaluchiController(BccLexService service) {
        super(service);
    }

    @GetMapping("/words/baluchi")
    public List<LexEntry> searchByBaluchi(@RequestParam(value = "word", required = false) String bcc){
        return service.searchEntries(bcc);
    }
}
