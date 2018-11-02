package com.sdu.ibdp.mapper;

import com.sdu.ibdp.po.Article;

import java.util.List;

public interface ArticleMapper {
    //增加
    public int insertArticle(Article article);
    //查询所有的
    public List<Article> getArticleList();
    //查询一篇文章
    public Article getArticleById(String id);
    //修改文章
    public void updateArticle(Article article);
    //删除文章
    public void deleteArticle(String id);
}
