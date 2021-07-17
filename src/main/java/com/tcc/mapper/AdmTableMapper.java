package com.tcc.mapper;

import com.tcc.pojo.AdmTable;
import com.tcc.pojo.AdmTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdmTableMapper {
    int countByExample(AdmTableExample example);

    int deleteByExample(AdmTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdmTable record);

    int insertSelective(AdmTable record);

    List<AdmTable> selectByExample(AdmTableExample example);

    AdmTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdmTable record, @Param("example") AdmTableExample example);

    int updateByExample(@Param("record") AdmTable record, @Param("example") AdmTableExample example);

    int updateByPrimaryKeySelective(AdmTable record);

    int updateByPrimaryKey(AdmTable record);
}