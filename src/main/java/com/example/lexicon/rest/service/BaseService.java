package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.LexEntry;

import java.util.List;

public interface BaseService {
    List<LexEntry> getAll();
    List<LexEntry> searchEntries(String str);
    List<LexEntry> searchByPos(String pos, String str);
    List<String> search(String str);
}
