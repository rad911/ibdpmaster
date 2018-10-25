package com.sdu.ibdp.controller;

import com.sdu.ibdp.po.Model;
import com.sdu.ibdp.service.ModelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Model的接口")
@RestController
@RequestMapping("/model")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @ApiOperation("查询模型的接口")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Model getModelById(@ApiParam(name="id",value = "Model的id",required = true) @PathVariable("id") Integer id){
       return modelService.findById(id);
    }

    @ApiOperation("添加模型的接口")
    @RequestMapping(method = RequestMethod.POST)
    public int addModel(@RequestBody @ApiParam(name="model",value = "Model的对象(JSON格式)",required = true) Model model){
        //设置使用次数为1
        model.setUsed(1);
        //设置收藏数为0
        model.setCollection(0);
        return modelService.addModel(model);
    }

    @ApiOperation("删除模型的接口")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delModel(@ApiParam(name="id",value = "模型的id",required = true) @PathVariable("id") Integer id){
        modelService.delModel(id);
    }

    @ApiOperation("更新模型的接口")
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void updateModel(@ApiParam(name="id",value = "模型的id",required =true) @PathVariable("id") Integer id,
                            @ApiParam(name="model",value = "模型的信息",required = true) @RequestBody Model model){
        model.setId(id);
        modelService.updateModel(model);
    }

}
