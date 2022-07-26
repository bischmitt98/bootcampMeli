package meli.elastic.repositories;

import meli.elastic.models.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArticleRepo extends ElasticsearchRepository<Article, Integer> {
}
