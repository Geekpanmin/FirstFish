package com.fish.mapper;

import com.fish.pojo.Pooldata;
import com.fish.pojo.PooldataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PooldataMapper {
    int countByExample(PooldataExample example);

    int deleteByExample(PooldataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pooldata record);

    int insertSelective(Pooldata record);

    List<Pooldata> selectByExample(PooldataExample example);

    Pooldata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pooldata record, @Param("example") PooldataExample example);

    int updateByExample(@Param("record") Pooldata record, @Param("example") PooldataExample example);

    int updateByPrimaryKeySelective(Pooldata record);

    int updateByPrimaryKey(Pooldata record);
}