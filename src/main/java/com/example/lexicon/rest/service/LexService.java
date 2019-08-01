package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.repository.LexiconRepository;

import java.util.List;

public abstract class LexService implements BaseService{

    private LexiconRepository repository;
    LexService(LexiconRepository repository){
        this.repository = repository;
    }

    LexEntry getById(Integer id){
        return null;
    }

    public List<LexEntry> getAll(){
        return null;
    }
}
