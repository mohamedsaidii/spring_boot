package com.semst.gestiondestock.Repository;

import com.semst.gestiondestock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository  extends JpaRepository<Article,Integer> {
}
