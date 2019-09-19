package com.fish.mapper;

import com.fish.pojo.Pool;
import com.fish.pojo.PoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoolMapper {
    int countByExample(PoolExample example);

    int deleteByExample(PoolExample example);

    int deleteByPrimaryKey(Integer poolId);

    int insert(Pool record);

    int insertSelective(Pool record);

    List<Pool> selectByExample(PoolExample example);

    Pool selectByPrimaryKey(Integer poolId);

    int updateByExampleSelective(@Param("record") Pool record, @Param("example") PoolExample example);

    int updateByExample(@Param("record") Pool record, @Param("example") PoolExample example);

    int updateByPrimaryKeySelective(Pool record);

    int updateByPrimaryKey(Pool record);
}