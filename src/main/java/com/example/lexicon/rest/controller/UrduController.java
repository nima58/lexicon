package com.example.lexicon.rest.controller;

import com.example.lexicon.rest.domain.BaluchiEnglish;
import com.example.lexicon.rest.service.BaluchiEnglishService;
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
public class UrduController extends BaseController {
    @Autowired
    UrduController(BaluchiEnglishService service) {
        super(service);
    }

    @GetMapping("/words/urdu")
    public List<BaluchiEnglish> searchByUrdu(@RequestParam(value = "word", required = false) String ur){
        return service.searchByUrdu(ur);
    }

}
