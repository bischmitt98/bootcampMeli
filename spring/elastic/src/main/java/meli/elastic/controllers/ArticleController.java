package meli.elastic.controllers;

import meli.elastic.models.Article;
import meli.elastic.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/{id}")
    public ResponseEntity<Article> findById(@PathVariable int id){
        return ResponseEntity.ok(articleService.findById(id));
    }

    @GetMapping
    public ResponseEntity <List<Article>> findAll(){
        return ResponseEntity.ok(articleService.findAll());
    }

    @GetMapping("/title/{title}")
    public Page<Article> getPageByTitle(@PathVariable String title, Pageable pg) {
        return articleService.getPageByTitle(title, pg);
    }

    @PostMapping
    public ResponseEntity<Article> save (@RequestBody Article article){
        return ResponseEntity.ok(articleService.save(article));
    }

    @PutMapping
    public ResponseEntity<Article> update(@RequestBody Article article) {
        return ResponseEntity.ok(articleService.update(article));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Article> delete(@PathVariable int id){
        articleService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/v/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id) {
        return ResponseEntity.ok(articleService.delete(id));
    }

}
