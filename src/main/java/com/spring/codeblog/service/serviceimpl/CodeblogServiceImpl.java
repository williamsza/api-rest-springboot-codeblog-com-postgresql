package com.spring.codeblog.service.serviceimpl;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.BlogRepository;
import com.spring.codeblog.service.CodeblogService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeblogServiceImpl implements CodeblogService {


   @Autowired
    BlogRepository blogRepository;



    @Override
    public List<Post> findAll() {
        return null;
    }

    @Override
    public Post findById(long id) {
        return null;
    }

    @Override
    public Post save(Post post) {
        return null;
    }
}
