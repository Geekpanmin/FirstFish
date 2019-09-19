package com.fish.mapper;

import com.fish.pojo.Predict;
import com.fish.pojo.PredictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PredictMapper {
    int countByExample(PredictExample example);

    int deleteByExample(PredictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Predict record);

    int insertSelective(Predict record);

    List<Predict> selectByExample(PredictExample example);

    Predict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Predict record, @Param("example") PredictExample example);

    int updateByExample(@Param("record") Predict record, @Param("example") PredictExample example);

    int updateByPrimaryKeySelective(Predict record);

    int updateByPrimaryKey(Predict record);
}