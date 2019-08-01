package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.LexEntry;
import com.example.lexicon.rest.exception.ResourceNotFoundException;
import com.example.lexicon.rest.repository.LexiconRepository;
import com.example.lexicon.rest.utils.LexiconTableParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LexiconService {

    private LexiconRepository repository;

    @Autowired
    LexiconService(LexiconRepository repository) {
        this.repository = repository;
    }

    public List<LexEntry> getAll(){
        List<LexEntry> all = new ArrayList<>();
        Iterable<LexEntry> users = repository.findAll();
        users.forEach(all::add);
        return all.subList(0, 10);
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

}
