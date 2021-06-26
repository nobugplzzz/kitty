package com.luqiyu.kitty.admin.dao;

import com.luqiyu.kitty.admin.model.SysDict;
import java.util.List;

public interface SysDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    SysDict selectByPrimaryKey(Long id);

    List<SysDict> selectAll();

    int updateByPrimaryKey(SysDict record);
}