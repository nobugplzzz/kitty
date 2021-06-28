package com.luqiyu.kitty.admin.dao;

import com.luqiyu.kitty.admin.model.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);

    /**
     *  分页查询
     * @return 角色列表
     */
    List<SysRole> findPage();
}