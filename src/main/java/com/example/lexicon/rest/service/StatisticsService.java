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

        setAllwords();
        serEnglishWords();
        setBaluchiWords();
    }

    private void setBaluchiWords() {
        //statistics.setBccWords(lexiconService.searchByEnglish());
        //statistics.gsetA(lexiconService.getAll().size());
    }

    private void serEnglishWords() {
    }

    private void setAllwords() {

    }
}
