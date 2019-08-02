package com.example.lexicon.rest.service;

import com.example.lexicon.rest.utils.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticsService {

    private LexiconService lexiconService;

    @Autowired
    StatisticsService(LexiconService lexiconService){
        this.lexiconService = lexiconService;
    }

    private Statistics statistics;
    public Statistics getStatistics(){
        manageStatistics();
        return statistics;
    }

    private void manageStatistics() {
        statistics = new Statistics();
        statistics.setAllWords(lexiconService.getAll().size());
        statistics.setBccWords(lexiconService.getAllNotNullBcc().size());
        statistics.setBccLatinWords(lexiconService.getAllNotNullLatinCom().size());
        statistics.setBccSciWords(lexiconService.getAllNotNullLatinSci().size());
        statistics.setEngWords(lexiconService.getAllNotNullEng().size());
        statistics.setFaWords(lexiconService.getAllNotNullFa().size());
        statistics.setPosWords(lexiconService.getAllNotNullPos().size());
        statistics.setUrWords(lexiconService.getAllNotNullUr().size());
    }

}
