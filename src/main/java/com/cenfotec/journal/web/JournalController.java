package com.cenfotec.journal.web;


import com.cenfotec.journal.domain.Journal;
import com.cenfotec.journal.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;

@Controller
public class JournalController {
    @Autowired
    JournalService journalService;
    @RequestMapping("/")
    public String index(Model model) throws ParseException {
        model.addAttribute("journal",
                journalService.getAllJournals());
        Journal newEntry = new Journal("Hola Mundo", "un saludo",
                "07/15/2017");
        journalService.saveJournal(newEntry);
        return "index";
    }
}
