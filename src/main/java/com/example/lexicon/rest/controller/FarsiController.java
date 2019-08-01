package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.service.FaLexService;
import com.example.lexicon.rest.service.LexService;
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
public class FarsiController extends BaseController {

    private FaLexService service;

    @Autowired
    FarsiController(FaLexService service) {
        super(service);
    }

    @GetMapping("/words/farsi")
    public List<LexEntry> searchByEnglish(@RequestParam(value = "word", required = false) String fa){
        return service.searchEntries(fa);
    }
}
