package com.luqiyu.kitty.admin.dao;

import com.luqiyu.kitty.admin.model.SysLog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    List<SysLog> selectAll();

    int updateByPrimaryKey(SysLog record);

    /**
     *  分页查询
     * @return 日志列表
     */
    List<SysLog> findPage();
}