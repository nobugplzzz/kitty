package com.luqiyu.kitty.admin.dao;

import com.luqiyu.kitty.admin.model.SysDict;
import com.luqiyu.kitty.admin.model.SysLog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysLogMapper {
    /**
     * 根据id删除
     *
     * @param id id
     * @return 影响行
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 新增，要求全部字段不为空
     *
     * @param record 新增实体
     * @return 影响行
     */
    int insert(SysLog record);

    /**
     * 新增，可部分字段
     *
     * @param record 新增实体
     * @return 影响行
     */
    int insertSelective(SysLog record);

    /**
     * 根据id查询
     *
     * @param id 实体id
     * @return 影响行
     */
    SysLog selectByPrimaryKey(Long id);

    /**
     * 查询全部
     *
     * @return 实体列表
     */
    List<SysLog> selectAll();

    /**
     * 根据id更新，要求全部字段不为空
     *
     * @param record 实体
     * @return 影响行
     */
    int updateByPrimaryKey(SysLog record);

    /**
     * 根据id更新，可部分字段
     *
     * @param record 实体
     * @return 影响行
     */
    int updateByPrimaryKeySelective(SysLog record);

    /**
     *  分页查询
     * @return 日志列表
     */
    List<SysLog> findPage();
}