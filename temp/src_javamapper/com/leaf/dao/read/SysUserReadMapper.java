package com.leaf.dao.read;

import com.leaf.model.SysUser;
import com.leaf.model.SysUserCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface SysUserReadMapper {
    int countByExample(@Param("example") SysUserCriteria example);

    List<SysUser> selectByExample(@Param("example") SysUserCriteria example);

    SysUser selectByPrimaryKey(@Param("id") String id);

    SysUser selectByExampleForOne(@Param("example") SysUserCriteria example);

    List<Map<String, Object>> selectMapByExample(@Param("example") SysUserCriteria example);

    Map<String, Object> selectMapByPrimaryKey(@Param("id") String id);

    Map<String, Object> selectMapByExampleForOne(@Param("example") SysUserCriteria example);
}