package com.sdu.ibdp.service;

import com.sdu.ibdp.mapper.ArticleMapper;
import com.sdu.ibdp.po.Article;
import com.sdu.ibdp.util.FilterHtmlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public int insertArticle(Article article){
        article.setReleaseDate(sdf.format(new Date()));
        String content = FilterHtmlUtils.Html2Text(article.getHtmlContent());
        // System.out.println("content=="+content);
        if(article.getSummary()==null ||" ".equals(article.getSummary())){
            if(content.length()>100){
                article.setSummary(content.substring(0,100));
            }else{
                article.setSummary(content.substring(0,content.length()));
            }
        }
        return articleMapper.insertArticle(article);
    }
    //查询所有
    public List<Article> getArticleList(){
        return articleMapper.getArticleList();
    }
    //查询一篇文章
    public Article getArticleById(String id){
        return articleMapper.getArticleById(id);
    }
    //修改文章
    public void updateArticle(Article article){
        article.setReleaseDate(sdf.format(new Date()));
         articleMapper.updateArticle(article);
    }
    //删除文章
    public void deleteArticle(String id){
        articleMapper.deleteArticle(id);
    }
}
