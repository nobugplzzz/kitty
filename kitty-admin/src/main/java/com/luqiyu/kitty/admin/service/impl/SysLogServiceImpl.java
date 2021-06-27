package com.luqiyu.kitty.admin.service.impl;


import com.luqiyu.kitty.admin.dao.SysLogMapper;
import com.luqiyu.kitty.admin.model.SysLog;
import com.luqiyu.kitty.admin.service.SysLogService;
import com.luqiyu.kitty.core.page.ColumnFilter;
import com.luqiyu.kitty.core.page.MybatisPageHelper;
import com.luqiyu.kitty.core.page.PageRequest;
import com.luqiyu.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLogServiceImpl  implements SysLogService {

	@Autowired
	private SysLogMapper sysLogMapper;

	@Override
	public int save(SysLog record) {
		return 0;
	}

	@Override
	public int delete(SysLog record) {
		return 0;
	}

	@Override
	public int delete(List<SysLog> records) {
		return 0;
	}

	@Override
	public SysLog findById(Long id) {
		return null;
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		ColumnFilter columnFilter = pageRequest.getColumnFilter("userName");
		if(columnFilter != null) {
			return MybatisPageHelper.findPage(pageRequest, sysLogMapper, "findPageByUserName", columnFilter.getValue());
		}
		return MybatisPageHelper.findPage(pageRequest, sysLogMapper);
	}
}
