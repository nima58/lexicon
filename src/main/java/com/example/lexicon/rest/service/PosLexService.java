package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.repository.LexiconRepository;
import com.example.lexicon.rest.utils.Pos;
import com.example.lexicon.rest.utils.WritingSystem;
import io.micrometer.shaded.org.pcollections.POrderedSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PosLexService extends LexService {

    @Autowired
    PosLexService(LexiconRepository repository) {
        super(repository);
    }

    @Override
    public List<LexEntry> searchEntries(String str) {
        return null;
    }

    @Override
    public List<LexEntry> searchByPos(String pos, String str) {
        return getRepository().findByPos(pos);
    }

    @Override
    public List<String> search(String str) {
        return null;
    }

    public List<LexEntry> searchByPos(String pos) {
        return getRepository().findByPos(pos);
    }

}
