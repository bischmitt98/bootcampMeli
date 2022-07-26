package meli.elastic.controllers;

import meli.elastic.models.Article;
import meli.elastic.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/{id}")
    public ResponseEntity<Article> findById(@PathVariable int id){
        return ResponseEntity.ok(articleService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Article> save (@RequestBody Article article){
        return ResponseEntity.ok(articleService.save(article));
    }
}
