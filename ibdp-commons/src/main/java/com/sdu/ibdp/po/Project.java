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
@ApiModel(value="Project对象",description = "模型")//表示对类进行说明，用于参数用实体类接收
@Data                  //编译时自动添加Setter、Getter、toString（）、equals()和hashCode()。
@NoArgsConstructor     //注解在 类 上；为类提供一个无参的构造方法
@AllArgsConstructor    //注解在类上；为类提供一个全参的构造方法，加了这个注解后，类中不提供默认构造方法了
@Accessors(chain=true) //开启链式访问
public class Project {
    /**
     * @ApiModelProperty()用于方法，字段； 表示对model属性的说明或者数据操作更改
     * value–字段说明
     * name–重写属性名字
     * dataType–重写属性类型
     * required–是否必填
     * example–举例说明
     * hidden–隐藏
     */
    //Project中的id
    @ApiModelProperty(name = "id" ,value = "项目id",required = true,hidden =true,example = "23")
    private String id;

    @ApiModelProperty(name = "name" ,value="项目名称" ,example = "项目一")
    private String name;

    //一般前台给后台传值时用
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") //格式化前台日期参数注解
    //将Date转换成String  一般后台传值给前台时
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(name = "createTime",value="项目创建时间", example = "2018-10-25 16:50:10")
    private Date createTime;

    @ApiModelProperty(name = "describe", value="项目描述" ,example = "这是一个有关水温调节的项目")
    private String description;
}
