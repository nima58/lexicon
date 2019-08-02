package com.example.lexicon.rest.repository;

import com.example.lexicon.rest.domain.LexEntry;
import org.springframework.data.jpa.repository.Query;
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

    //Statistics
    @Query(value =  "SELECT le.ur FROM LexEntry le WHERE le.ur <> 'NULL' ")
    List<LexEntry> getAllNotNullUr();

    @Query(value =  "SELECT le.fa FROM LexEntry le WHERE le.fa <> 'NULL' ")
    List<LexEntry> getAllNotNullFa();

    @Query(value =  "SELECT le.eng FROM LexEntry le WHERE le.eng <> 'NULL' ")
    List<LexEntry> getAllNotNullEng();

    @Query(value =  "SELECT le.bcc FROM LexEntry le WHERE le.bcc <> 'NULL' ")
    List<LexEntry> getAllNotNullBcc();

    @Query(value =  "SELECT le.bccLatinSci FROM LexEntry le WHERE le.bccLatinSci <> 'NULL' ")
    List<LexEntry> getAllNotNullLatinSci();

    @Query(value =  "SELECT le.bccLatinCom FROM LexEntry le WHERE le.bccLatinCom <> 'NULL' ")
    List<LexEntry> getAllNotNullLatinCom();

    @Query(value =  "SELECT le.pos FROM LexEntry le WHERE le.pos <> 'NULL' ")
    List<LexEntry> getAllNotNullPos();
}


