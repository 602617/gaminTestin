package com.example.gaming.Repo;

import com.example.gaming.Entity.NewPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewPostRepo extends JpaRepository<NewPostEntity, Long> {
}
