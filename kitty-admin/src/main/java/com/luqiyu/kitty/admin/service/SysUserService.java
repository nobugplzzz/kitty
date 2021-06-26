package com.luqiyu.kitty.admin.service;

import com.luqiyu.kitty.admin.model.SysUser;

import java.util.List;

/**
 * SysUser服务接口
 *
 * @author: 启誉
 * @create: 2021-06-25
 **/
public interface SysUserService {
    /**
     * 根据用户ID查找用户
     * @param userId
     * @return
     */
    SysUser findByUserId(Long userId);

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();
}
