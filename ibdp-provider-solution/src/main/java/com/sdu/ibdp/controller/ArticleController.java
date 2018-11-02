package com.sdu.ibdp.controller;

import com.sdu.ibdp.po.Article;
import com.sdu.ibdp.service.ArticleService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "Article的接口（文章）")
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    private String rootPath="/image/";
//    @Value("${imageUpload.url}")
    private String UPLOAD_FILEPATH ="D:/pic/";
    @ApiOperation("添加Article的接口")
    @PostMapping("/Article")
    public int insertArticle(@ApiParam(name = "article",value = "article对象",required = true)@RequestBody Article article){
        System.out.println(article.getReleaseDate());
        return articleService.insertArticle(article);
    }
    @ApiOperation("上传图片的接口")
    public Map<String,Object> uploadFile(@RequestParam(value = "editormd-image-file",required = false) MultipartFile file, HttpServletRequest request){
        Map<String,Object> resultMap = new HashMap<String, Object>();
        System.out.println(request.getContextPath());
        String realPath =UPLOAD_FILEPATH;
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
//        File targetFile = new File(realPath,fileName);
//        if (!targetFile.exists()){
//            targetFile.mkdirs();
//        }
        try{
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOAD_FILEPATH+file.getOriginalFilename());
            Files.write(path,bytes);
            resultMap.put("success",1);
            resultMap.put("message","上传成功！");
            resultMap.put("url",rootPath+fileName);
        } catch (Exception e) {
            resultMap.put("success",0);
            resultMap.put("message","上传失败");
            e.printStackTrace();
        }
        System.out.println(resultMap.get("success"));
        return  resultMap;
    }
    @ApiOperation("查询所有文章的接口")
    @GetMapping("/Articles")
    public List<Article> Article(){
        return articleService.getArticleList();
    }

    @ApiOperation("查询一篇文章的接口")
    @GetMapping("/Article/{id}")
    public Article getArticleById(@ApiParam(name = "id",value = "article的id",required = true) @PathVariable("id") String id){
        return articleService.getArticleById(id);
    }

    @ApiOperation("修改文章的接口")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "article",value = "article对象",required = true,dataType = "Article"),
//            @ApiImplicitParam(name="id",value="文章id",required = true,dataType = "String")
//    })
    @ApiParam(name = "article",value = "article对象",required = true)
    @PutMapping("/Article")
    public void updateArticle(@RequestBody Article article){
        articleService.updateArticle(article);
    }

    @ApiOperation("删除文章的接口")
    @DeleteMapping("/Article/{id}")
    public void deleteArticle(@ApiParam(name = "id",value = "article的id",required = true) @PathVariable("id") String id){
        articleService.deleteArticle(id);
    }

}
