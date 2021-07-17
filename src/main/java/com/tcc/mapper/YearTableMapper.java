package com.tcc.mapper;

import com.tcc.pojo.YearTable;
import com.tcc.pojo.YearTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearTableMapper {
    int countByExample(YearTableExample example);

    int deleteByExample(YearTableExample example);

    int deleteByPrimaryKey(Integer yearId);

    int insert(YearTable record);

    int insertSelective(YearTable record);

    List<YearTable> selectByExample(YearTableExample example);

    YearTable selectByPrimaryKey(Integer yearId);

    int updateByExampleSelective(@Param("record") YearTable record, @Param("example") YearTableExample example);

    int updateByExample(@Param("record") YearTable record, @Param("example") YearTableExample example);

    int updateByPrimaryKeySelective(YearTable record);

    int updateByPrimaryKey(YearTable record);

    int selectSum();
}