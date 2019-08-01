package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin
@RestController
@Api(value="onlinelexicon", description="Operations pertaining to names in Online lexicon")
public class LatinSciController extends BaseController {

    @GetMapping("/words/latin-sci")
    public List<LexEntry> searchByLatinSci(@RequestParam(value = "word", required = false) String sci){
        return service.searchByLatinSci(sci);
    }
}
