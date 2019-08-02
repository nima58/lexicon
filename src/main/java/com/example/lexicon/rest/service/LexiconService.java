package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.exception.ResourceNotFoundException;
import com.example.lexicon.rest.repository.LexiconRepository;
import com.example.lexicon.rest.utils.LexiconTableParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;

@Service
public class LexiconService {
    private Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private LexiconRepository repository;

    @Autowired
    LexiconService(LexiconRepository repository) {
        this.repository = repository;
    }

    public List<LexEntry> getAll(){
        List<LexEntry> all = new ArrayList<>();
        Iterable<LexEntry> users = repository.findAll();
        users.forEach(all::add);
        logger.info("All entries in DB: " + all.size());
        return all;
    }

    public LexEntry getById(Integer id){
        if(repository.existsById(id)) {
            return repository.findById(id).get();
        } else {
            throw new ResourceNotFoundException("Resource with id = " + id + " not found!");
        }
    }

    public void removeById(Integer id){
        if(repository.existsById(id))
            repository.deleteById(id);
        else
            throw new ResourceNotFoundException("An object with id  = " + id + " not found!");
    }

    public LexEntry update(LexEntry t, Integer id) {
        System.out.println("Update an already existing object " + t.toString());
        if(repository.existsById(id)){
            return repository.save(t);
        } else
            throw new ResourceNotFoundException("An object with id = " + id + " not found!");
    }

    public List<LexEntry> search(LexiconTableParameters lexiconSearchParameters) {
        return null;
    }

    public List<LexEntry> searchByEnglish(String bcc) {
        return repository.findByEngStartingWith(bcc);
    }

    public List<LexEntry> searchByBaluchi(String bcc) {
        return repository.findByBccStartingWith(bcc);
    }

    public List<LexEntry> searchByFarsi(String fa) {
        return repository.findByFaStartingWith(fa);
    }

    public List<LexEntry> searchByUrdu(String ur) { return repository.findByUrStartingWith(ur);
    }

    public List<LexEntry> searchByLatinSci(String sci) { return repository.findByBccLatinSciStartingWith(sci);
    }

    public List<LexEntry> searchByLatinCom(String com) { return repository.findByBccLatinComStartingWith(com);
    }

    public List<LexEntry> searchByPosAndEnglish(String pos, String eng) {
        return repository.findByPosAndEngStartingWith(pos, eng);
    }

    List<LexEntry> getAllNotNullFa(){
        return repository.getAllNotNullFa();
    }

    List<LexEntry> getAllNotNullUr(){
        return repository.getAllNotNullUr();
    }

    List<LexEntry> getAllNotNullBcc() {
        return repository.getAllNotNullBcc();
    }

    List<LexEntry> getAllNotNullLatinCom() {
        return repository.getAllNotNullLatinCom();
    }

    List<LexEntry> getAllNotNullLatinSci() {
        return repository.getAllNotNullLatinSci();
    }

    List<LexEntry> getAllNotNullEng() {
        return repository.getAllNotNullEng();
    }

    List<LexEntry> getAllNotNullPos() {
        return repository.getAllNotNullPos();
    }
}
