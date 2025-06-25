package com.example.Journal_Appllication.controller;

import com.example.Journal_Appllication.entity.JournalEntity;
import com.example.Journal_Appllication.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JournalContoller {
    @Autowired
    public JournalService journalService;

    @GetMapping("/list")
    public List<JournalEntity> getlist(){
        return journalService.getalllist();
    }
    @PostMapping("/create")
    public boolean createEntry(@RequestBody JournalEntity myEntity){
        journalService.save(myEntity);
        return true;
    }
    @GetMapping("id/{myId}")
    public Optional getId(@PathVariable Long myId){
        return journalService.getId(myId);
    }

    @DeleteMapping("id/{removeId}")
    public void removeData(@PathVariable Long removeId){
        journalService.removeData(removeId);
    }

//    @PutMapping("id/{id}")
//    public JournalEntity updateData(@PathVariable Long id, @RequestBody JournalEntity newEntity){
//        Optional<JournalEntity> old= Optional.ofNullable(journalService.findbyId(id).orElse(null));
//        if (old != null && !old.isEmpty()){
//
//
//
//        }
//
//        return journalService.update(newEntity);
//    }
}
