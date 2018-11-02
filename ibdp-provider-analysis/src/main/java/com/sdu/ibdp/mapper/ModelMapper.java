package com.sdu.ibdp.mapper;

import com.sdu.ibdp.po.Model;

import java.util.List;


public interface ModelMapper{
    Model findById(String id);

    int addModel(Model model);

    void delModel(String id);

    void updateModel(Model model);

    List<Model> getModels();
}
