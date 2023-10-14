package com.example.gaming.Controller;

import com.example.gaming.Entity.NewPostEntity;
import com.example.gaming.Service.NewPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class ShowTableController {

    @Autowired
    private NewPostService newPostService;

    @GetMapping("/hovedtabell")
    public String viewTable(Model model){
        model.addAttribute("posts", newPostService.showNewPost());
        return "hovedtabell";
    }

}
