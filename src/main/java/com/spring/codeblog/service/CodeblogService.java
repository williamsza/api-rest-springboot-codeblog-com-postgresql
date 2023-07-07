package com.spring.codeblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.BlogRepository;
import org.springframework.stereotype.Service;

//@Service
public interface CodeblogService {

    List<Post> findAll();

    Post findById(long id);

    Post save(Post post);

}
