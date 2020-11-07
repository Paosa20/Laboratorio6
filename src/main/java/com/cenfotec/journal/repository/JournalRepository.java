package com.cenfotec.journal.repository;


import com.cenfotec.journal.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal,
        Long> {
}