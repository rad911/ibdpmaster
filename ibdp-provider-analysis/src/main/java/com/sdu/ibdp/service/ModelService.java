package com.sdu.ibdp.service;

import com.sdu.ibdp.domain.Model;
import com.sdu.ibdp.mapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
    @Autowired
    private ModelMapper modelMapper;

    public Model findById(Integer id){
        return modelMapper.findById(id);
    }
}
