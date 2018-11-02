package com.sdu.ibdp.mapper;


import com.sdu.ibdp.po.Project;

/**
 * Project
 */

public interface ProjectMapper {
    //
    public int insertProject(Project project)throws Exception;
    //
    public void deleteProjectById(String id)throws Exception;
    //
    public void updateProject(Project project)throws Exception;
    //
    public Project selectProjectById(String id)throws Exception;
}
