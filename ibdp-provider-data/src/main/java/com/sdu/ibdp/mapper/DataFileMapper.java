package com.sdu.ibdp.mapper;

import com.sdu.ibdp.po.DataFile;

public interface DataFileMapper {
     DataFile getDataFileById(String id);

     int addDataFile(DataFile dataFile);
}
