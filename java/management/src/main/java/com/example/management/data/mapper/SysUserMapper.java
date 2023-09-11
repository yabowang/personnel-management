package com.example.management.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.management.data.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yabo.dg
 * @description 针对表【sys_user(系统管理员表)】的数据库操作Mapper
 * @createDate 2023-09-11 18:11:54
 * @Entity com.example.management.data.mapper.generator.domain.SysUser
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}




