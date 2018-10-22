package com.sdu.ibdp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//开启链式访问
@Accessors(chain=true)
public class Model {
    private Integer id;
    private String name;
    //名词的描述
    private String description;
    //创建时间
    private Date createTime;
    //类型
    private String type;
    //被使用数
    private Integer used;
    //被收藏数
    private Integer collection;

}
