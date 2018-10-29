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

@ApiModel(value="数据文件对象",description = "数据文件")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class DataFile {
    @ApiModelProperty(name = "id",hidden = true)
    private String id;

    @ApiModelProperty(hidden = true)
    private String localPath;

    @ApiModelProperty(hidden = true)
    private String hdfsPath;

    @ApiModelProperty(name = "name",value = "数据文件的名字",example = "文件1")
    private String name;

    @ApiModelProperty(name = "size",value = "数据文件的大小",hidden = true)
    private String size;

    @ApiModelProperty(name = "type",value = "数据文件的类型",example = "供暖数据文件")
    private String type;

    @ApiModelProperty(name = "suffix",value = "数据文件的后缀名",hidden = true)
    private String suffix;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") //格式化前台日期参数注解*/
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")//将Date转换成String  一般后台传值给前台时
    @ApiModelProperty(name = "createTime",value = "数据文件的创建时间",example = "2018-10-26 19:55:00")
    private Date createTime;

    @ApiModelProperty(name = "hasHead",value = "数据文件是否包含表头(0代表无)",example = "1")
    private int hasHeader;

}
