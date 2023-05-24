package com.culturehub.services.ipml;

import com.culturehub.entities.Blog;
import com.culturehub.repositories.BlogRepository;
import com.culturehub.services.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
