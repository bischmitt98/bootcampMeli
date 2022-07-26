package meli.elastic.repositories;

import meli.elastic.models.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArticleRepo extends ElasticsearchRepository<Article, Integer> {
    @Query("{\"match_all\": {} }")
    List<Article> findAllArticles();

    @Query("{\"match\": {\"title\": {\"query\": \"?0\"}}}")
    Page<Article> findByTitle(String title, Pageable pg);
}
