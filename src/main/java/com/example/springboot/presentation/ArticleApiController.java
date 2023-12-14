package com.example.springboot.presentation;

import com.example.springboot.application.ArticleUseCase;
import com.example.springboot.presentation.dto.AddArticleRequest;
import com.example.springboot.domain.entity.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ArticleApiController {

    private final ArticleUseCase articleUseCase;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = articleUseCase.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }
}
