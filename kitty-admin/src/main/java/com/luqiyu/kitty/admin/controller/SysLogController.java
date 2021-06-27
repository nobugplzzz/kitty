package com.luqiyu.kitty.admin.controller;


import com.luqiyu.kitty.admin.service.SysLogService;
import com.luqiyu.kitty.core.http.HttpResult;
import com.luqiyu.kitty.core.page.PageRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 日志控制器
 * @author Louis
 * @date Oct 29, 2018
 */
@Api(tags="日志模块")
@RestController
@RequestMapping("log")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @ApiOperation("分页查询")
    @PostMapping(value="/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysLogService.findPage(pageRequest));
    }
}
