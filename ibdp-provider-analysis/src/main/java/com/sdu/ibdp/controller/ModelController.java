package com.sdu.ibdp.controller;

import com.sdu.ibdp.po.Model;
import com.sdu.ibdp.service.ModelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Api(tags = "Model的接口")
@RestController
public class ModelController {

    @Autowired
    private ModelService modelService;

    @ApiOperation("查询模型的接口")
    @RequestMapping(value = "/model/{id}",method = RequestMethod.GET)
    public Model getModelById(@ApiParam(name="id",value = "Model的id",required = true) @PathVariable("id") String id){
       return modelService.findById(id);
    }

    @ApiOperation("添加模型的接口")
    @RequestMapping(value = "/model",method = RequestMethod.POST)
    public int addModel(@RequestBody @ApiParam(name="model",value = "Model的对象(JSON格式)",required = true) Model model){
        //设置使用次数为1
        model.setUsed(1);
        //设置收藏数为0
        model.setCollection(0);
        return modelService.addModel(model);
    }

    @ApiOperation("删除模型的接口")
    @RequestMapping(value = "/model/{id}",method = RequestMethod.DELETE)
    public void delModel(@ApiParam(name="id",value = "模型的id",required = true) @PathVariable("id") String id){
        modelService.delModel(id);
    }

    @ApiOperation("更新模型的接口")
    @RequestMapping(value = "/model/{id}",method = RequestMethod.PUT)
    public void updateModel(@ApiParam(name="id",value = "模型的id",required =true) @PathVariable("id") String id,
                            @ApiParam(name="model",value = "模型的信息",required = true) @RequestBody Model model){
        model.setId(id);
        modelService.updateModel(model);
    }

    @ApiOperation("得到模型的列表")
    @RequestMapping(value="/models",method = RequestMethod.GET)
    public List<Model> getModels(){
        return modelService.getModels();
    }
}
