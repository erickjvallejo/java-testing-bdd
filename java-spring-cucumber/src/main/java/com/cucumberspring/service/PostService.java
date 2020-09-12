package com.cucumberspring.service;

import com.cucumberspring.domain.Post;

import java.util.List;
import java.util.Optional;


public interface PostService {

    Post save(Post post);

    void delete(Long id);

    List<Post> findAll();

    Optional<Post> findById(Post post);





}
