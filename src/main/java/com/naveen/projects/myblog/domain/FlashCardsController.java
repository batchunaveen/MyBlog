package com.naveen.projects.myblog.controller;

import com.naveen.projects.myblog.domain.FlashCards;
import com.naveen.projects.myblog.domain.FlashCardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlashCardsController {

    @Autowired
    public FlashCardsRepository flashCardsRepository;

    @GetMapping("/flashcards")
    public List<FlashCards> retrieveAllFlashCards() {
        return flashCardsRepository.findAll();
    }
}
