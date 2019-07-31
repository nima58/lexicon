package com.example.lexicon.rest.repository;

import com.example.lexicon.rest.domain.BaluchiEnglish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaluchiEnglishRepository extends CrudRepository<BaluchiEnglish, Integer> {
    List<BaluchiEnglish> findByBccStartingWith(String bcc);
    List<BaluchiEnglish> findByEngStartingWith(String eng);
    List<BaluchiEnglish> findByFaStartingWith(String fa);
    List<BaluchiEnglish> findByUrStartingWith(String ur);
    List<BaluchiEnglish> findByBccLatinComStartingWith(String com);
    List<BaluchiEnglish> findByBccLatinSciStartingWith(String sci);

    List<BaluchiEnglish> findByPosAndEngStartingWith(String pos, String eng);
    List<BaluchiEnglish> findByPosAndBccStartingWith(String pos, String eng);
    List<BaluchiEnglish> findById(int id);

}
