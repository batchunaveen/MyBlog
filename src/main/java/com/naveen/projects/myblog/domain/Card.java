package com.naveen.projects.myblog.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Setter
//employee will be the name of table in mongodb
@Document(collection = "cards")
public class Card {



    @Id
    public ObjectId _id;
    private String id;
    private Integer type;
    private String front;
    private String back;
    private Boolean known;

    public Card() {}

    public Card(String id, Integer type, String front, String back, Boolean known) {
        this.id = id;
        this.type = type;
        this.front = front;
        this.back = back;
        this.known = known;
    }
}
