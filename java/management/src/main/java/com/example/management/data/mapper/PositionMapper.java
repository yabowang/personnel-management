package com.example.management.data.mapper;

import com.example.management.data.domain.Position;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yabo.dg
* @description 针对表【position(公司职位)】的数据库操作Mapper
* @createDate 2023-09-11 18:11:54
* @Entity com.example.management.data.mapper.generator.domain.Position
*/
@Mapper
public interface PositionMapper extends BaseMapper<Position> {

}




