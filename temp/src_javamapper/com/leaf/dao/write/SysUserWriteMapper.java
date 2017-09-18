package com.leaf.dao.write;

import com.leaf.model.SysUser;
import com.leaf.model.SysUserCriteria;
import org.apache.ibatis.annotations.Param;

public interface SysUserWriteMapper {
    int deleteByExample(@Param("example") SysUserCriteria example);

    int deleteByPrimaryKey(@Param("id") String id);

    int insert(@Param("record") SysUser record);

    int insertSelective(@Param("record") SysUser record);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserCriteria example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserCriteria example);

    int updateByPrimaryKeySelective(@Param("record") SysUser record);

    int updateByPrimaryKey(@Param("record") SysUser record);
}