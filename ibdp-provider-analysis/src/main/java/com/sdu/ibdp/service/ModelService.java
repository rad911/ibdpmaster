package com.sdu.ibdp.service;

import com.sdu.ibdp.mapper.ModelMapper;
import com.sdu.ibdp.po.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
    @Autowired
    private ModelMapper modelMapper;

    public Model findById(Integer id){
        return modelMapper.findById(id);
    }

    public int addModel(Model model){
        return modelMapper.addModel(model);
    }

    public void delModel(Integer id){
        modelMapper.delModel(id);
    }

    public void updateModel(Model model){
        modelMapper.updateModel(model);
    }
}
