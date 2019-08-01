package com.example.lexicon.rest.repository;

import com.example.lexicon.rest.domain.LexEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LexiconRepository extends CrudRepository<LexEntry, Integer> {
    List<LexEntry> findByBccStartingWith(String bcc);
    List<LexEntry> findByEngStartingWith(String eng);
    List<LexEntry> findByFaStartingWith(String fa);
    List<LexEntry> findByUrStartingWith(String ur);
    List<LexEntry> findByBccLatinComStartingWith(String com);
    List<LexEntry> findByBccLatinSciStartingWith(String sci);

    List<LexEntry> findByPosAndEngStartingWith(String pos, String eng);
    List<LexEntry> findByPosAndBccStartingWith(String pos, String eng);
    List<LexEntry> findById(int id);

    List<LexEntry> findByPosAndBccLatinComStartingWith(String pos, String str);

    List<LexEntry> findByPosAndBccLatinSciStartingWith(String pos, String str);

    List<LexEntry> findByPosAndFaStartingWith(String pos, String str);

    List<LexEntry> findByPosAndUrStartingWith(String pos, String str);
}


