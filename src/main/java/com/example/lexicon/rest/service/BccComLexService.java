package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.repository.LexiconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BccComLexService extends LexService {

    @Autowired
    BccComLexService(LexiconRepository repository) {
        super(repository);
    }

    @Override
    public List<LexEntry> searchEntries(String str) {
        return getRepository().findByBccLatinComStartingWith(str);
    }

    @Override
    public List<LexEntry> searchByPos(String pos, String str) {
        return getRepository().findByPosAndBccLatinComStartingWith(pos, str);
    }

    @Override
    public List<String> search(String str) {
        return null;
    }
}
