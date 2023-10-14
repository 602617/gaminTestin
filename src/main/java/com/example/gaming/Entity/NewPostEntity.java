package com.example.gaming.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "newpost")
public class NewPostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gamename")
    private String gameName;
    private String title;
    private String dato;


    public NewPostEntity(String gameName, String title, String dato) {
        this.gameName = gameName;
        this.title = title;
        this.dato = dato;
    }

    public NewPostEntity() {

    }

    public Long getId() {
        return id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }


//    create table newpost (
//            id SERIAL primary key,
//            gameName varchar(55),
//    title varchar(55),
//    dato varchar(55)
//);
}
