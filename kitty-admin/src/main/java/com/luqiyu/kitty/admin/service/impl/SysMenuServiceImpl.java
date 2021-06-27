package com.luqiyu.kitty.admin.service.impl;


import com.luqiyu.kitty.admin.model.SysMenu;
import com.luqiyu.kitty.admin.service.SysMenuService;
import com.luqiyu.kitty.core.page.PageRequest;
import com.luqiyu.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {


	@Override
	public int save(SysMenu record) {
		return 0;
	}

	@Override
	public int delete(SysMenu record) {
		return 0;
	}

	@Override
	public int delete(List<SysMenu> records) {
		return 0;
	}

	@Override
	public SysMenu findById(Long id) {
		return null;
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return null;
	}
}
