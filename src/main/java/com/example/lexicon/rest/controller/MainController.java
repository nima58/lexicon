package com.example.lexicon.rest.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
/*
    private BaluchiEnglishService service;

    @Autowired
    MainController(BaluchiEnglishService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello from Lexicon Main Controller ...";
    }

    @GetMapping("/words/english")
    public List<BaluchiEnglish> searchByEnglish(@RequestParam(value = "eng", required = false) String eng){
        return service.searchByEnglish(eng);
    }

    @GetMapping("/words/baluchi")
    public List<BaluchiEnglish> searchByBaluchi(@RequestParam(value = "bcc", required = false) String bcc){
        return service.searchByBaluchi(bcc);
    }

    @GetMapping("/words")
    public List<BaluchiEnglish> getAll(
            @RequestParam(value = "bcc", required = false) String bcc,
            @RequestParam(value = "eng", required = false) String eng,
            @RequestParam(value = "pos", required = false) String pos,
            @RequestParam(value = "bcc-latin-com", required = false) String bccCom,
            @RequestParam(value = "bcc-latin-sci", required = false) String bccSci,
            @RequestParam(value = "farsi", required = false) String fa,
            @RequestParam(value = "urdu", required = false) String ur) {
        LexiconTableParameters lexiconSearchParameters = new LexiconTableParameters(bcc, eng, pos,bccCom, bccSci, fa, ur);
     //   return service.search(lexiconSearchParameters);
        return service.getAll();
    }

    @GetMapping("/words/{id}")
    public BaluchiEnglish getById(@PathVariable(value = "id") Integer id) {
        return service.getById(id);
    }*/

}
