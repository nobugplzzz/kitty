package com.luqiyu.kitty.admin.controller;

import com.luqiyu.kitty.admin.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 *
 * @author: 启誉
 * @create: 2021-06-25
 **/
@Api(tags="用户模块")
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @ApiOperation("根据用户id查询用户")
    @ApiImplicitParam(name = "userId",value = "用户id",required = true,dataType = "Long")
    @GetMapping(value="/findByUserId")
    public Object findByUserId(@RequestParam Long userId) {
        return sysUserService.findByUserId(userId);
    }


    @ApiOperation("查询全部用户")
    @GetMapping(value="/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }
}
