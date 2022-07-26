package meli.elastic.services;

import meli.elastic.models.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IArticleService {
    Article save(Article article);
    Article findById(int id);
    String delete(int id);
    List<Article> findAll();
    Article update(Article article);
    Page<Article> getPageByTitle(String title, Pageable pg);
}
