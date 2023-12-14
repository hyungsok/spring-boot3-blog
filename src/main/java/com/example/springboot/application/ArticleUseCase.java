package com.example.springboot.application;

import com.example.springboot.presentation.dto.AddArticleRequest;
import com.example.springboot.domain.entity.Article;
import com.example.springboot.domain.repository.ArticleRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ArticleUseCase {
    private final ArticleRepository articleRepository;

    public Article save(AddArticleRequest request) {
        return articleRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
