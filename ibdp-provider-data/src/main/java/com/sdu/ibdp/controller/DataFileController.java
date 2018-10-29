package com.sdu.ibdp.controller;

import com.sdu.ibdp.po.DataFile;
import com.sdu.ibdp.service.DataFileService;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Api(tags="DataFile的接口(数据文件)")
@RestController
public class DataFileController {

    @Autowired
    private DataFileService dataFileService;

    @ApiOperation("查询DataFile的接口")
    @RequestMapping(value = "/DataFile/{id}",method = RequestMethod.GET)
    public DataFile getDataFileById(@ApiParam(name = "id",value = "dataFile的id",required = true) String id){
        return dataFileService.getDataFileById(id);
    }

    @ApiOperation("添加DataFile的接口")
    @RequestMapping(value = "/DataFile",method = RequestMethod.POST)
    public int addDataFile(@ApiParam(name="dataFile",value = "dataFile(json对象)",required = true)@RequestBody DataFile dataFile){
        return dataFileService.addDataFile(dataFile);
    }

    @ApiOperation("文件上传的接口(File)")
    @RequestMapping(value="/File",method = RequestMethod.POST)
    public void uploadFile(@ApiParam(name = "file",value = "文件",required = true) MultipartFile file){

    }
}
