package com.example.gaming.Controller;

import com.example.gaming.Service.NewPostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class deleteController {
    private final NewPostService newPostService;

    public deleteController(NewPostService newPostService) {
        this.newPostService = newPostService;
    }

    @PostMapping("/delete-post")
    public String slettPost(@RequestParam Long id){
        newPostService.deleteNewPost(id);

        return "redirect:/hovedtabell";

    }
}
