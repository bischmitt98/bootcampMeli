package meli.elastic.services;

import lombok.RequiredArgsConstructor;
import meli.elastic.models.Article;
import meli.elastic.repositories.IArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService implements IArticleService{


    private final IArticleRepo articleRepo;

    @Override
    public Article save(Article article){
        return articleRepo.save(article);
    }

    @Override
    public Article findById(int id){
        return articleRepo.findById(id).get();
    }
}
