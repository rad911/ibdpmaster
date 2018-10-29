package com.sdu.ibdp.service;

import com.sdu.ibdp.mapper.DataFileMapper;
import com.sdu.ibdp.po.DataFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataFileService {

    @Autowired
    private DataFileMapper dataFileMapper;

    public DataFile getDataFileById(String id){
        return dataFileMapper.getDataFileById(id);
    }

    public int addDataFile(DataFile dataFile){
        return dataFileMapper.addDataFile(dataFile);
    }
}
