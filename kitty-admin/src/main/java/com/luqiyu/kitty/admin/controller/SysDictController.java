package com.luqiyu.kitty.admin.controller;

import com.luqiyu.kitty.admin.service.SysDictService;
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
 * 字典控制器
 *
 * @author: 启誉
 * @create: 2021-06-27
 **/
@Api(tags="字典模块")
@RestController
@RequestMapping("dict")
public class SysDictController {

    @Autowired
    private SysDictService sysDictService;

    @ApiOperation("分页查询")
    @PostMapping(value="/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysDictService.findPage(pageRequest));
    }

}
