package com.sdu.ibdp.controller;


import com.sdu.ibdp.po.Project;
import com.sdu.ibdp.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags="Project的接口")
@RestController
@RequestMapping("/Project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    /**
     * ApiOperation：用在方法上，说明方法的作用，每一个url资源的定义,使用方式
     * RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。
     *               用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
     * PathVariable 可以将 URL 中占位符参数绑定到控制器处理方法的入参中:URL 中的 {xxx} 占位符可以通过
     * ApiParam请求属性,使用方式：也可使用在请求对象上。
     * RequestBody接收的是一个Json对象的字符串，而不是一个Json对象
     */

    @ApiOperation("查询模型的接口")//表示一个http请求的操作
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Project selectProjectById(@ApiParam(name="id",value = "Project的id",required = true) @PathVariable("id") String id)throws Exception{
        Project project = projectService.selectProjectById("1");
        System.out.println("id:"+id);
        return projectService.selectProjectById(id);
    }


    @ApiOperation("添加模型的接口")//表示一个http请求的操作
    @RequestMapping(method = RequestMethod.POST)
    public int insertProject(@RequestBody @ApiParam(name="project",value = "Project的对象(Json类型)",required = true) Project project)throws Exception{
        return projectService.insertProject(project);
    }


    @ApiOperation("删除模型的接口")//表示一个http请求的操作
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteProjectById(@ApiParam(name="id",value = "Project的id",required = true) @PathVariable("id") String id)throws Exception{
         projectService.deleteProjectById(id);
    }


    @ApiOperation("更新模型的接口")
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void updateProject(@ApiParam(name="id",value = "项目的id",required =true) @PathVariable("id") String id,
            @ApiParam(name="project",value = "项目的信息",required = true) @RequestBody Project project)throws Exception{
        project.setId(id);
        projectService.updateProject(project);
    }
}
