package com.example.page.controller;

import com.example.page.dao.PostRepository;
import com.example.page.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/posts")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @PostMapping
    public void addPost(@RequestBody Post post) {
        postRepository.save(post);
    }

    @GetMapping
    public @ResponseBody Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping(path = "/sec/{section}")
    public @ResponseBody Iterable<Post> getPostsFromSection(@PathVariable("section") String section) {
        return postRepository.findBySection(section);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deletePostById(@PathVariable("id") Integer id) {
        postRepository.deleteById(id);
    }

    @PutMapping(path = "/update/{id}")
    public void updatePostById(@PathVariable("id") Integer id) {

    }
}
