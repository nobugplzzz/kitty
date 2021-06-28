package com.luqiyu.kitty.admin.service.impl;

import com.luqiyu.kitty.admin.dao.SysDeptMapper;
import com.luqiyu.kitty.admin.model.SysDept;
import com.luqiyu.kitty.admin.service.SysDeptService;
import com.luqiyu.kitty.core.page.PageRequest;
import com.luqiyu.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDeptServiceImpl implements SysDeptService {

	@Autowired
	private SysDeptMapper sysDeptMapper;

	@Override
	public int save(SysDept record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysDeptMapper.insertSelective(record);
		}
		return sysDeptMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delete(SysDept record) {
		return 0;
	}

	@Override
	public int delete(List<SysDept> records) {
		return 0;
	}

	@Override
	public SysDept findById(Long id) {
		return null;
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return null;
	}

	@Override
	public List<SysDept> findTree() {
		return null;
	}
}
