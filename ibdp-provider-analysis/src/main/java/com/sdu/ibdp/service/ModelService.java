package com.sdu.ibdp.service;

import com.sdu.ibdp.mapper.ModelMapper;
import com.sdu.ibdp.po.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    @Autowired
    private ModelMapper modelMapper;

    public Model findById(String id){
        return modelMapper.findById(id);
    }

    public int addModel(Model model){
        return modelMapper.addModel(model);
    }

    public void delModel(String id){
        modelMapper.delModel(id);
    }

    public void updateModel(Model model){
        modelMapper.updateModel(model);
    }

    public List<Model> getModels(){
        return modelMapper.getModels();
    }
}
