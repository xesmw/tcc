package com.tcc.mapper;

import com.tcc.pojo.StTable;
import com.tcc.pojo.StTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StTableMapper {
    int countByExample(StTableExample example);

    int deleteByExample(StTableExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(StTable record);

    int insertSelective(StTable record);

    List<StTable> selectByExample(StTableExample example);

    StTable selectByPrimaryKey(Integer stId);

    int updateByExampleSelective(@Param("record") StTable record, @Param("example") StTableExample example);

    int updateByExample(@Param("record") StTable record, @Param("example") StTableExample example);

    int updateByPrimaryKeySelective(StTable record);

    int updateByPrimaryKey(StTable record);
}