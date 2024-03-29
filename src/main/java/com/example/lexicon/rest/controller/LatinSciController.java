package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.service.BccSciLexService;
import com.example.lexicon.rest.utils.Pos;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@Api(value="onlinelexicon", description="Operations pertaining to names in Online lexicon")
public class LatinSciController extends BaseController {

    @Autowired
    LatinSciController(BccSciLexService service) {
        super(service);
    }

    @GetMapping("/words/latin-sci")
    public List<LexEntry> searchByLatinSci(@RequestParam(value = "word", required = false) String sci){
        return getService().searchEntries(sci);
    }

    @ApiOperation(value = "View a list of available words", response = List.class)
    @GetMapping("/words/latin-sci/pos")
    public List<LexEntry> searchByLatinSciAndPos(
            @RequestParam(value = "pos", required = false) Pos pos,
            @RequestParam(value = "word", required = false) String sci){
        return getService().searchByPos(pos.getPos(), sci);
    }
}
