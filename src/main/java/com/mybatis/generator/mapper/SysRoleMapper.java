package com.mybatis.generator.mapper;

import com.mybatis.generator.entity.SysRole;

public interface SysRoleMapper {
    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String rid);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}