package com.tcc.mapper;

import com.tcc.pojo.FreeTable;
import com.tcc.pojo.FreeTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreeTableMapper {
    int countByExample(FreeTableExample example);

    int deleteByExample(FreeTableExample example);

    int deleteByPrimaryKey(Integer freeId);

    int insert(FreeTable record);

    int insertSelective(FreeTable record);

    List<FreeTable> selectByExample(FreeTableExample example);

    FreeTable selectByPrimaryKey(Integer freeId);

    int updateByExampleSelective(@Param("record") FreeTable record, @Param("example") FreeTableExample example);

    int updateByExample(@Param("record") FreeTable record, @Param("example") FreeTableExample example);

    int updateByPrimaryKeySelective(FreeTable record);

    int updateByPrimaryKey(FreeTable record);
}