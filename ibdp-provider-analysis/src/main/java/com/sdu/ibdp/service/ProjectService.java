package com.sdu.ibdp.service;

import com.sdu.ibdp.mapper.ProjectMapper;
import com.sdu.ibdp.po.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectMapper projectMapper;


    public Project selectProjectById(String id)throws Exception{
        return projectMapper.selectProjectById(id);
    }

    public int insertProject(Project project)throws Exception{
        return projectMapper.insertProject(project);
    }

    public void deleteProjectById(String id)throws Exception{
        projectMapper.deleteProjectById(id);
    }

    public void updateProject(Project project)throws Exception{
        projectMapper.updateProject(project);
    }
}
