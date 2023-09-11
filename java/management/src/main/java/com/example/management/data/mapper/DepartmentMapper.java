package com.example.management.data.mapper;

import com.example.management.data.domain.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yabo.dg
* @description 针对表【department(公司部门)】的数据库操作Mapper
* @createDate 2023-09-11 18:11:54
* @Entity com.example.management.data.mapper.generator.domain.Department
*/
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {

}




