package com.luqiyu.kitty.admin.controller;

import com.luqiyu.kitty.admin.service.SysUserService;
import com.luqiyu.kitty.core.http.HttpResult;
import com.luqiyu.kitty.core.page.PageRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @ApiOperation("分页查询")
    @PostMapping(value="/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }

}
