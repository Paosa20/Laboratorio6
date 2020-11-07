package com.cenfotec.journal.service;

import com.cenfotec.journal.domain.Journal;

import java.util.List;


public interface JournalService {

    public void saveJournal(Journal newJournal);
    public List<Journal> getAllJournals();

}
