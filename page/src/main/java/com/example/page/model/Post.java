package com.example.page.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String content;
    private String section;
    private Integer author_id;
    private LocalDateTime creation_date = LocalDateTime.now();
    private LocalDateTime edit_date;

    public Post() {}

    public Post(@JsonProperty("content") String content,
                @JsonProperty("section") String section,
                @JsonProperty("author_id") Integer author_id) {
        this.content = content;
        this.section = section;
        this.author_id = author_id;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSection() {
        return section;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public LocalDateTime getCreation_date() {
        return creation_date;
    }

    public LocalDateTime getEdit_date() {
        return edit_date;
    }

    public void setEdit_date(LocalDateTime edit_date) {
        this.edit_date = edit_date;
    }
}
