package com.example.page.dao;

import com.example.page.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    Iterable<Post> findBySection(String section);

}
