package com.tcc.mapper;

import com.tcc.pojo.CarTable;
import com.tcc.pojo.CarTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarTableMapper {
    int countByExample(CarTableExample example);

    int deleteByExample(CarTableExample example);

    int deleteByPrimaryKey(Integer carId);

    int insert(CarTable record);

    int insertSelective(CarTable record);

    List<CarTable> selectByExample(CarTableExample example);

    CarTable selectByPrimaryKey(Integer carId);

    int updateByExampleSelective(@Param("record") CarTable record, @Param("example") CarTableExample example);

    int updateByExample(@Param("record") CarTable record, @Param("example") CarTableExample example);

    int updateByPrimaryKeySelective(CarTable record);

    int updateByPrimaryKey(CarTable record);

    int selectSum();
}