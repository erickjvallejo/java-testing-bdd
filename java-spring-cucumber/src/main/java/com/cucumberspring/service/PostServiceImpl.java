package com.cucumberspring.service;

import com.cucumberspring.domain.Post;
import com.cucumberspring.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PostServiceImpl implements PostService{

    PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post save(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public void delete(Long id) {
        this.postRepository.deleteById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Post> findById(Post post) {
        return postRepository.findById(post.getId());
    }

    @Override
    @Transactional(readOnly = true)
    public List<Post> findAll() {
        return postRepository.findAll();
    }
}
