package com.cenfotec.journal.service;

import com.cenfotec.journal.domain.Journal;
import com.cenfotec.journal.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServiceImp implements JournalService{
    @Autowired
    JournalRepository journalRepo;
    @Override
    public void saveJournal(Journal newJournal) {
        journalRepo.save(newJournal);
    }
    @Override
    public List<Journal> getAllJournals() {
        return journalRepo.findAll();
    }
}
