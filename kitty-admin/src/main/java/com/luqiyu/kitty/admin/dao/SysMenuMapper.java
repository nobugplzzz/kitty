package com.luqiyu.kitty.admin.dao;

import com.luqiyu.kitty.admin.model.SysMenu;
import java.util.List;

public interface SysMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysMenu record);

    SysMenu selectByPrimaryKey(Long id);

    List<SysMenu> selectAll();

    int updateByPrimaryKey(SysMenu record);


}