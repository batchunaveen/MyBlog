package com.naveen.projects.myblog.domain;


import org.springframework.data.mongodb.repository.MongoRepository;


public interface FlashCardsRepository extends MongoRepository<FlashCards, Long> {


}
