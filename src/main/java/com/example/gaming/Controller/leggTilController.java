package com.example.gaming.Controller;

import com.example.gaming.Entity.NewPostEntity;
import com.example.gaming.Service.NewPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/leggtil")
public class leggTilController {

    @Autowired
    private final NewPostService newPostService;

    public leggTilController(NewPostService newPostService) {
        this.newPostService = newPostService;
    }

    @GetMapping
    public String visLeggtil(){
        return "leggtil";
    }

    @PostMapping
    public String leggTil(String gameName, String title, String dato){
        NewPostEntity newPostEntity = new NewPostEntity();
        newPostEntity.setGameName(gameName);
        newPostEntity.setTitle(title);
        newPostEntity.setDato(dato);

        newPostService.addNewPost(newPostEntity);

        return "redirect:/hovedtabell";

    }
}
