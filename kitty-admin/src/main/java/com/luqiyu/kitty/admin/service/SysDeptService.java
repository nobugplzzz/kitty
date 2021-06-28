package com.luqiyu.kitty.admin.service;


import com.luqiyu.kitty.admin.model.SysDept;
import com.luqiyu.kitty.core.service.CurdService;

import java.util.List;

/**
 * 机构管理
 * @author Louis
 * @date Oct 29, 2018
 */
public interface SysDeptService extends CurdService<SysDept> {

    /**
     * 查询机构树
     * @return 机构列表
     */
    List<SysDept> findTree();
}
