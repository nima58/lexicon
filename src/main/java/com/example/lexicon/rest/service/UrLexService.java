package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.repository.LexiconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UrLexService extends LexService {

    private LexiconRepository repository;

    @Autowired
    UrLexService(LexiconRepository repository) {
        super(repository);
    }

    @Override
    public List<LexEntry> searchEntries(String str) {
        return repository.findByUrStartingWith(str);
    }

    @Override
    public List<LexEntry> searchByPos(String pos, String str) {
        return repository.findByPosAndUrStartingWith(pos, str);
    }

    @Override
    public List<String> search(String str) {
        return null;
    }
}
