package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.service.BccLexService;
import io.swagger.annotations.Api;
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

}
