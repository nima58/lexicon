package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.service.FaLexService;
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
public class FaController extends BaseController {

    @Autowired
    FaController(FaLexService service) {
        super(service);
    }

    @GetMapping("/words/farsi")
    public List<LexEntry> searchByFarsi(@RequestParam(value = "word", required = false) String fa){
        return getService().searchEntries(fa);
    }
}