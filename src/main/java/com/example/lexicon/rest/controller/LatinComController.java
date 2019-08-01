package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.service.BccComLexService;
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
public class LatinComController extends BaseController {

    private BccComLexService service;

    @Autowired
    LatinComController(BccComLexService service) {
        super(service);
    }

    @GetMapping("/words/latin-com")
    public List<LexEntry> searchByLatinCom(@RequestParam(value = "word", required = false) String com){
        return service.searchEntries(com);
    }
}
