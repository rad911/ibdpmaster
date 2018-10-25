package com.sdu.ibdp.mapper;

import com.sdu.ibdp.po.Model;


public interface ModelMapper{
    Model findById(Integer id);

    int addModel(Model model);

    void delModel(Integer id);

    void updateModel(Model model);
}
