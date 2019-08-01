package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.repository.LexiconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BccSciLexService extends LexService {

    @Autowired
    BccSciLexService(LexiconRepository repository) {
        super(repository);
    }

    @Override
    public List<LexEntry> searchEntries(String str) {
        return getRepository().findByBccLatinSciStartingWith(str);
    }

    @Override
    public List<LexEntry> searchByPos(String pos, String str) {
        return getRepository().findByPosAndBccLatinSciStartingWith(pos, str);
    }

    @Override
    public List<String> search(String str) {
        return null;
    }
}
