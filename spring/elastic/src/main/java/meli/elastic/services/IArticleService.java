package meli.elastic.services;

import meli.elastic.models.Article;

public interface IArticleService {
    Article save(Article article);
    Article findById(int id);
}
