package com.culturehub.api;

import com.culturehub.entities.Blog;
import com.culturehub.services.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BlogAPI {

    private final BlogService blogService;

    @GetMapping("/blog/all")
    public List<Blog> getAll(){
        return blogService.findAll();
    }
}
