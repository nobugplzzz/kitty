package com.luqiyu.kitty.admin.dao;

import com.luqiyu.kitty.admin.model.SysUserToken;

import java.util.List;

public interface SysUserTokenMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserToken record);

    SysUserToken selectByPrimaryKey(Long id);

    List<SysUserToken> selectAll();

    int updateByPrimaryKey(SysUserToken record);
}