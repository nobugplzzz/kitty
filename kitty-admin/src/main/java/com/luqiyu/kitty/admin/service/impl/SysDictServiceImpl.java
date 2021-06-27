package com.luqiyu.kitty.admin.service.impl;


import com.luqiyu.kitty.admin.dao.SysDictMapper;
import com.luqiyu.kitty.admin.model.SysDict;
import com.luqiyu.kitty.admin.service.SysDictService;
import com.luqiyu.kitty.core.page.ColumnFilter;
import com.luqiyu.kitty.core.page.MybatisPageHelper;
import com.luqiyu.kitty.core.page.PageRequest;
import com.luqiyu.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDictServiceImpl  implements SysDictService {

	@Autowired
	private SysDictMapper sysDictMapper;

	@Override
	public int save(SysDict record) {
		return 0;
	}

	@Override
	public int delete(SysDict record) {
		return 0;
	}

	@Override
	public int delete(List<SysDict> records) {
		return 0;
	}

	@Override
	public SysDict findById(Long id) {
		return null;
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
		if(columnFilter != null) {
			return MybatisPageHelper.findPage(pageRequest, sysDictMapper, "findPageByLabel", columnFilter.getValue());
		}
		return MybatisPageHelper.findPage(pageRequest, sysDictMapper);
	}
}
