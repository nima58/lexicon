package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.LexEntry;

public interface BaseService {
    LexEntry getById(Integer id);
}
