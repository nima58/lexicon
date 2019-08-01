package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.repository.LexiconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BccLexService extends LexService {

    private LexiconRepository repository;

    @Autowired
    BccLexService(LexiconRepository repository) {
        super(repository);
    }

    @Override
    public List<LexEntry> searchEntries(String str) {
        return repository.findByBccStartingWith(str);
    }

    @Override
    public List<LexEntry> searchByPos(String pos, String str) {
        return repository.findByPosAndBccStartingWith(pos, str);
    }

    @Override
    public List<String> search(String str) {
        return null;
    }
}
