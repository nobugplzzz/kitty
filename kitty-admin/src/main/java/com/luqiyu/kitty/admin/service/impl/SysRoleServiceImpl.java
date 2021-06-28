package com.luqiyu.kitty.admin.service.impl;



import com.luqiyu.kitty.admin.dao.SysRoleMapper;
import com.luqiyu.kitty.admin.model.SysRole;
import com.luqiyu.kitty.admin.service.SysRoleService;
import com.luqiyu.kitty.core.page.ColumnFilter;
import com.luqiyu.kitty.core.page.MybatisPageHelper;
import com.luqiyu.kitty.core.page.PageRequest;
import com.luqiyu.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysRoleServiceImpl  implements SysRoleService {

	@Autowired
	private SysRoleMapper sysRoleMapper;

	@Override
	public int save(SysRole record) {
		return 0;
	}

	@Override
	public int delete(SysRole record) {
		return 0;
	}

	@Override
	public int delete(List<SysRole> records) {
		return 0;
	}

	@Override
	public SysRole findById(Long id) {
		return null;
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
		if(columnFilter != null && columnFilter.getValue() != null) {
			return MybatisPageHelper.findPage(pageRequest, sysRoleMapper, "findPageByName", columnFilter.getValue());
		}
		return MybatisPageHelper.findPage(pageRequest, sysRoleMapper);
	}
}
