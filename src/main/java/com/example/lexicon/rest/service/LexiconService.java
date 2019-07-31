package com.example.lexicon.rest.service;

import com.example.lexicon.rest.domain.BaluchiEnglish;
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
/*
    public BaluchiEnglish getById(Integer id){
        return repository.findById(id);
    }

    public List<BaluchiEnglish> getAll(){
        Iterable<BaluchiEnglish> all = repository.findAll();
        Set<BaluchiEnglish> result = new HashSet<>();
        all.forEach(o -> result.add(o));
        List<BaluchiEnglish> list = new ArrayList<>(result);
        return list.subList(0, 5);
    }
*/
    public List<BaluchiEnglish> getAll(){
        List<BaluchiEnglish> all = new ArrayList<>();
        Iterable<BaluchiEnglish> users = repository.findAll();
        users.forEach(all::add);
        return all.subList(0, 10);
    }

    public BaluchiEnglish getById(Integer id){
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

    public BaluchiEnglish update(BaluchiEnglish t, Integer id) {
        System.out.println("Update an already existing object " + t.toString());
        if(repository.existsById(id)){
            return repository.save(t);
        } else
            throw new ResourceNotFoundException("An object with id = " + id + " not found!");
    }

    public List<BaluchiEnglish> search(LexiconTableParameters lexiconSearchParameters) {
        return null;
    }

    public List<BaluchiEnglish> searchByEnglish(String bcc) {
        return repository.findByEngStartingWith(bcc);
    }

    public List<BaluchiEnglish> searchByBaluchi(String bcc) {
        return repository.findByBccStartingWith(bcc);
    }

    public List<BaluchiEnglish> searchByFarsi(String fa) {
        return repository.findByFaStartingWith(fa);
    }

    public List<BaluchiEnglish> searchByUrdu(String ur) { return repository.findByUrStartingWith(ur);
    }

    public List<BaluchiEnglish> searchByLatinSci(String sci) { return repository.findByBccLatinSciStartingWith(sci);
    }

    public List<BaluchiEnglish> searchByLatinCom(String com) { return repository.findByBccLatinComStartingWith(com);
    }
/*
    public List<BaluchiEnglish> searchByPos(String pos) { return repository.findByPos(pos);
    }*/

    public List<BaluchiEnglish> searchByPosAndEnglish(String pos, String eng) {
        return repository.findByPosAndEngStartingWith(pos, eng);
    }
/*
    public T create(T t) {
        System.out.println("Create a new object " + t.toString());
        return repository.save(t);
    }

    public R getRepository() {
        return repository;
    }

    public void setRepository(R repository) {
        this.repository = repository;
    }

    public void removeById(N id){
        if(repository.existsById(id))
            repository.deleteById(id);
        else
            throw new ResourceNotFoundException("An object with id  = " + id + " not found!");
    }

    @Override
    public T update(T t, N id) {
        System.out.println("Update an already existing object " + t.toString());
        if(repository.existsById(id)){
            return repository.save(t);
        } else
            throw new ResourceNotFoundException("An object with id = " + id + " not found!");
    }*/
}
