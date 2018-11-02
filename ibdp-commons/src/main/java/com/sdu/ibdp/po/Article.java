package com.sdu.ibdp.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ApiModel(value = "Article对象",description = "文章")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Article {
    @ApiModelProperty(name = "id",value = "文章id",hidden = true)
    private String id;
    @ApiModelProperty(name = "title",value = "文章标题")
    private String title;
    @ApiModelProperty(name = "summary",value = "文章概要")
    private String summary;
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
//    @ApiModelProperty(name = "releaseDate",value = "文章发布日期",example = "2018-10-31 19:00:00")
    @ApiModelProperty(name = "releaseDate",value = "文章发布日期")
    private String releaseDate;
    // private Date releaseDate;
    @ApiModelProperty(name = "content",value = "文章内容")
    private String content;
    @ApiModelProperty(name = "htmlContent",value = "文章html内容")
    private String htmlContent;
    @ApiModelProperty(name = "keyWord",value ="文章关键字")
    private String keyWord;
}
