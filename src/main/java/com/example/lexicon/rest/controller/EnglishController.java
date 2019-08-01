package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@Api(value="onlinelexicon", description="Operations pertaining to names in Online lexicon")
public class EnglishController extends BaseController{

    @ApiOperation(value = "View a list of available words", response = List.class)
    @GetMapping("/words/english")
    public List<LexEntry> searchByEnglish(@RequestParam(value = "word", required = false) String eng){
        return service.searchByEnglish(eng);
    }

    @ApiOperation(value = "View a list of available words", response = List.class)
    @GetMapping("/words/english/pos")
    public List<LexEntry> searchByEnglishAndPos(
            @RequestParam(value = "pos", required = false) String pos,
            @RequestParam(value = "word", required = false) String eng){
        return service.searchByPosAndEnglish(pos, eng);
    }
}
