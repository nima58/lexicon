package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.service.BccLexService;
import com.example.lexicon.rest.utils.Pos;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@Api(value="onlinelexicon", description="Operations pertaining to names in Online lexicon")
public class BccController extends BaseController{

    //private BccLexService service;
    @Autowired
    BccController(BccLexService service) {
        super(service);
    }

    @GetMapping("/words/baluchi")
    public List<LexEntry> searchByBaluchi(@RequestParam(value = "word", required = false) String bcc){
        return getService().searchEntries(bcc);
    }

    @GetMapping("/words/baluchi/all")
    public List<String> getAll(){
        List<LexEntry> all = getService().getAll();
        if(all != null)
            return all.stream().map(LexEntry::getBcc).collect(Collectors.toList()).subList(0, 20);
        else{
            System.out.println("Null encountered, add exception here");
            return new ArrayList<>();
        }
    }

    @ApiOperation(value = "View a list of available words", response = List.class)
    @GetMapping("/words/baluchi/autocomp")
    public List<String> searchByBccAutocomp(@RequestParam(value = "word", required = false) String bcc){
        if (bcc.length()> 2) {
            List<LexEntry> lexEntries = getService().searchEntries(bcc);
            return lexEntries.stream().map(LexEntry::getBcc).collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }

    @ApiOperation(value = "View a list of available words", response = List.class)
    @GetMapping("/words/baluchi/pos")
    public List<LexEntry> searchByBaluchiAndPos(
            @RequestParam(value = "pos", required = false) Pos pos,
            @RequestParam(value = "word", required = false) String bcc){
        return getService().searchByPos(pos.getPos(), bcc);
    }
}
