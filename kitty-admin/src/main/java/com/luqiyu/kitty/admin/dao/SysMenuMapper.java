package com.luqiyu.kitty.admin.dao;

import com.luqiyu.kitty.admin.model.SysLog;
import com.luqiyu.kitty.admin.model.SysMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysMenuMapper {
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
    int insert(SysMenu record);

    /**
     * 新增，可部分字段
     *
     * @param record 新增实体
     * @return 影响行
     */
    int insertSelective(SysMenu record);

    /**
     * 根据id查询
     *
     * @param id 实体id
     * @return 影响行
     */
    SysMenu selectByPrimaryKey(Long id);

    /**
     * 查询全部
     *
     * @return 实体列表
     */
    List<SysMenu> selectAll();

    /**
     * 根据id更新，要求全部字段不为空
     *
     * @param record 实体
     * @return 影响行
     */
    int updateByPrimaryKey(SysMenu record);

    /**
     * 根据id更新，可部分字段
     *
     * @param record 实体
     * @return 影响行
     */
    int updateByPrimaryKeySelective(SysMenu record);

}