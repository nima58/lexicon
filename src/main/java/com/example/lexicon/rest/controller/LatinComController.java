package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.BaluchiEnglish;
import com.example.lexicon.rest.service.LexiconService;
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
    @Autowired
    LatinComController(LexiconService service) {
        super(service);
    }

    @GetMapping("/words/latin-com")
    public List<BaluchiEnglish> searchByLatinCom(@RequestParam(value = "word", required = false) String com){
        return service.searchByLatinCom(com);
    }
}
