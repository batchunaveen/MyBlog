package com.naveen.projects.myblog.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cards")
public class CardsController {

    @Autowired
    public CardsRepository cardsRepository;

    public void setCardsRepository(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    @GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
    public String getHealthCheck()
    {
        return "{ \"isWorking\" : true }";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Card> retrieveAllFlashCards() {
        return cardsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Card> getEmployee(@PathVariable String id)
    {
        Optional<Card> flashCards = cardsRepository.findById(id);
        return flashCards;
    }

}
