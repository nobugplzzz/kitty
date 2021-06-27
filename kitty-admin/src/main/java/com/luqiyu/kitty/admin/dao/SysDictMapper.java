package com.luqiyu.kitty.admin.dao;

import com.luqiyu.kitty.admin.model.SysDict;
import com.luqiyu.kitty.admin.model.SysMenu;

import java.util.List;

public interface SysDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    SysDict selectByPrimaryKey(Long id);

    List<SysDict> selectAll();

    int updateByPrimaryKey(SysDict record);

    /**
     * 分页查询
     *
     * @return 字典列表
     */
    List<SysDict> findPage();
}