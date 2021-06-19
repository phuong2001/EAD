package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "publisher")
    private int publisher;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publisher" ,insertable = false,updatable = false)
    private PubliserEntity publiser;

    public PubliserEntity getPubliser() {
        return publiser;
    }

    public void setPubliser(PubliserEntity publiser) {
        this.publiser = publiser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublisher() {
        return publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
