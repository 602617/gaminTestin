package com.example.gaming.Service;

import com.example.gaming.Entity.NewPostEntity;
import com.example.gaming.Repo.NewPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewPostService {

    @Autowired
    private final NewPostRepo newPostRepo;


    public NewPostService(NewPostRepo newPostRepo) {
        this.newPostRepo = newPostRepo;
    }

    public List<NewPostEntity> showNewPost(){
        return newPostRepo.findAll();
    }



    public void addNewPost(NewPostEntity newPostEntity){
        newPostRepo.save(newPostEntity);
    }

    public void deleteNewPost(Long id){
        newPostRepo.deleteById(id);
    }
}
