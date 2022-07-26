package meli.elastic.services;

import lombok.RequiredArgsConstructor;
import meli.elastic.models.Article;
import meli.elastic.repositories.IArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Article> findAll() {
//        List<Article> list = new ArrayList<>();
//        Iterable<Article> res = articleRepo.findAll();
//        res.forEach(list::add);
        return articleRepo.findAllArticles();
    }

    @Override
    public String delete(int id) {
        articleRepo.deleteById(id);
        return "Artigo Deletado com sucesso";
    }

    @Override
    public Page<Article> getPageByTitle(String title, Pageable pg) {
        return articleRepo.findByTitle(title, pg);
    }

    @Override
    public Article update(Article article) {
        return articleRepo.save(article);
    }
}
