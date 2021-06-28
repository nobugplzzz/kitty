package com.luqiyu.kitty.admin.service;

import com.luqiyu.kitty.admin.model.SysRole;
import com.luqiyu.kitty.admin.model.SysUser;
import com.luqiyu.kitty.admin.model.SysUserRole;
import com.luqiyu.kitty.core.service.CurdService;

import java.util.List;

/**
 * SysUser服务接口
 *
 * @author: 启誉
 * @create: 2021-06-25
 **/
public interface SysUserService extends CurdService<SysUser> {
    /**
     * 查找用户的角色集合
     *
     * @param userId 用户id
     * @return
     */
    List<SysUserRole> findUserRoles(Long userId);
}
