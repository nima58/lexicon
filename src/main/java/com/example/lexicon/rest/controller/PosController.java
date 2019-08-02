package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.service.PosLexService;
import com.example.lexicon.rest.utils.Pos;
import com.example.lexicon.rest.utils.WritingSystem;
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
public class PosController extends BaseController {

    @Autowired
    PosController(PosLexService service) {
        super(service);
    }

    @ApiOperation(value = "View a list of available words", response = List.class)
    @GetMapping("/words/pos")
    public List<LexEntry> searchByLangAndPos(
            @RequestParam(value = "pos", required = false) Pos pos,
            @RequestParam(value = "word", required = false) WritingSystem ws){
        return getService().searchByPos(pos.getPos(), ws.getWs());
    }
}
