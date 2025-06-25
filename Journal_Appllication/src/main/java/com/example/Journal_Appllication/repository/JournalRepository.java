package com.example.Journal_Appllication.repository;

import com.example.Journal_Appllication.entity.JournalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends JpaRepository<JournalEntity, Long> {
    void deleteById(Long removeId);
}
