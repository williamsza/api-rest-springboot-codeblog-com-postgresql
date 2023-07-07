package com.spring.codeblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.service.CodeblogService;

@Controller
// @RestController
public class CodeBlogController {
    // @Autowired
    private CodeblogService codeblogService;

    public CodeBlogController(CodeblogService codeblogService) {
        this.codeblogService = codeblogService;
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = codeblogService.findAll();
        mv.addObject("posts", posts);
        return mv;

    }

}
