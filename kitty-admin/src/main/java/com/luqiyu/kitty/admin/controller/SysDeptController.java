package com.luqiyu.kitty.admin.controller;

import com.luqiyu.kitty.admin.model.SysDept;
import com.luqiyu.kitty.admin.service.SysDeptService;
import com.luqiyu.kitty.core.http.HttpResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 机构控制器
 * @author Louis
 * @date Oct 29, 2018
 */
@Api(tags="机构模块")
@RestController
@RequestMapping("dept")
public class SysDeptController {

    @Autowired
    private SysDeptService sysDeptService;

    @ApiOperation("新增机构")
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody SysDept record) {
        return HttpResult.ok(sysDeptService.save(record));
    }

    @ApiOperation("删除机构")
    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<SysDept> records) {
        return HttpResult.ok(sysDeptService.delete(records));
    }

    @ApiOperation("查询机构树")
    @GetMapping(value="/findTree")
    public HttpResult findTree() {
        return HttpResult.ok(sysDeptService.findTree());
    }

}
