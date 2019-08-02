package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.service.EngLexService;
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
public class EngController extends BaseController{

    @Autowired
    EngController(EngLexService service) {
        super(service);
    }

    @ApiOperation(value = "View a list of available words", response = List.class)
    @GetMapping("/words/english")
    public List<LexEntry> searchByEnglish(@RequestParam(value = "word", required = false) String eng){
        return getService().searchEntries(eng);
    }

    @ApiOperation(value = "View a list of available words", response = List.class)
    @GetMapping("/words/english/pos")
    public List<LexEntry> searchByEnglishAndPos(
            @RequestParam(value = "pos", required = false) Pos pos,
            @RequestParam(value = "word", required = false) String eng){
        return getService().searchByPos(pos.getPos(), eng);
    }
}
