package com.sdu.ibdp.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ApiModel(value="Model对象",description = "模型")
@Data
@NoArgsConstructor
@AllArgsConstructor
//开启链式访问
@Accessors(chain=true)
public class Model {
    //Model的id
    @ApiModelProperty(name="id",value = "模型id",hidden = true)
    private Integer id;
    @ApiModelProperty(name="name",value = "模型名字",example = "模型一")
    private String name;
    @ApiModelProperty(name="description",value = "模型描述",example = "模型一的描述")
    private String description;

    //一般前台给后台传值时用
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") //格式化前台日期参数注解
    //将Date转换成String  一般后台传值给前台时
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(name="createTime",value = "创建时间",example = "2018-10-25 16:50:10")
    private Date createTime;


    @ApiModelProperty(name="type",value = "模型类型",example = "供暖模型")
    private String type;
    @ApiModelProperty(name="used",value="被使用数",hidden =true)

    private Integer used;
    @ApiModelProperty(name="collection",value = "被收藏数",hidden = true)
    private Integer collection;
    //算法字符串
    @ApiModelProperty(name="algorithmString",value = "算法字符串",example = "执行算法字符串")
    private String algorithmString;
}