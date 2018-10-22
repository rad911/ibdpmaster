package com.sdu.ibdp.controller;

import com.sdu.ibdp.domain.Model;
import com.sdu.ibdp.service.ModelService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @ApiOperation("查询接口")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Model getModelById(@PathVariable("id") Integer id){
        System.out.println("111");
       return modelService.findById(id);
    }
}
