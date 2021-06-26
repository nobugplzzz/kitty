package com.luqiyu.kitty.admin.service.impl;

import com.luqiyu.kitty.admin.model.SysUser;
import com.luqiyu.kitty.admin.service.SysUserService;
import com.luqiyu.kitty.admin.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 启誉
 * @create: 2021-06-25
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUserId(Long userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }
}
