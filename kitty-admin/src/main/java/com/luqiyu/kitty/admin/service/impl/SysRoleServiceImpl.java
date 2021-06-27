package com.luqiyu.kitty.admin.service.impl;



import com.luqiyu.kitty.admin.model.SysRole;
import com.luqiyu.kitty.admin.service.SysRoleService;
import com.luqiyu.kitty.core.page.PageRequest;
import com.luqiyu.kitty.core.page.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysRoleServiceImpl  implements SysRoleService {


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
		return null;
	}
}
