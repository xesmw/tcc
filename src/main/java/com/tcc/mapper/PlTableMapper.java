package com.tcc.mapper;

import com.tcc.pojo.PlTable;
import com.tcc.pojo.PlTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlTableMapper {
    int countByExample(PlTableExample example);

    int deleteByExample(PlTableExample example);

    int deleteByPrimaryKey(Integer plId);

    int insert(PlTable record);

    int insertSelective(PlTable record);

    List<PlTable> selectByExample(PlTableExample example);

    PlTable selectByPrimaryKey(String plId);

    int updateByExampleSelective(@Param("record") PlTable record, @Param("example") PlTableExample example);

    int updateByExample(@Param("record") PlTable record, @Param("example") PlTableExample example);

    int updateByPrimaryKeySelective(int record);

    int updateByPrimaryKey(PlTable record);
}