package com.naveen.projects.myblog.domain;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CardsRepository extends MongoRepository<Card, String> {

    Card findBy_id(ObjectId _id);

}
