package com.naveen.projects.myblog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class FlashCards {

    private @Id @GeneratedValue Long id;
    private Long objectId;
    private Integer type;
    private String front;
    private String back;
    private Boolean known;

    public FlashCards() {}

    public FlashCards(Long objectId, Long id, Integer type, String front, String back, Boolean known) {
        this.objectId = objectId;
        this.id = id;
        this.type = type;
        this.front = front;
        this.back = back;
        this.known = known;
    }
}
