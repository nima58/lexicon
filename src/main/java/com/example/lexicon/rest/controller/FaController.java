package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.service.FaLexService;
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
public class FaController extends BaseController {

    @Autowired
    FaController(FaLexService service) {
        super(service);
    }

    @GetMapping("/words/farsi")
    public List<LexEntry> searchByFarsi(@RequestParam(value = "word", required = false) String fa){
        return getService().searchEntries(fa);
    }

    @ApiOperation(value = "View a list of available words", response = List.class)
    @GetMapping("/words/farsi/pos")
    public List<LexEntry> searchByFarsiAndPos(
            @RequestParam(value = "pos", required = false) Pos pos,
            @RequestParam(value = "word", required = false) String fa){
        return getService().searchByPos(pos.getPos(), fa);
    }
}
