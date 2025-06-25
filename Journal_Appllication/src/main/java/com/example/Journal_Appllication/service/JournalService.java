package com.example.Journal_Appllication.service;

import com.example.Journal_Appllication.entity.JournalEntity;
import com.example.Journal_Appllication.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalService {

    @Autowired
    public JournalRepository journalRepository;

    public void save(JournalEntity journalEntity){
        journalRepository.save(journalEntity);
    }

    public List<JournalEntity>getalllist(){
        return journalRepository.findAll();
    }

    public Optional<JournalEntity> getId(Long myId){
        return journalRepository.findById(myId);
    }

    public void  removeData(Long removeId){
         journalRepository.deleteById(removeId);
    }
    public JournalEntity update(JournalEntity newEntity){
       return journalRepository.save(newEntity);
    }

    public Optional<JournalEntity> findbyId(Long id) {
        return journalRepository.findById(id);
    }

}
