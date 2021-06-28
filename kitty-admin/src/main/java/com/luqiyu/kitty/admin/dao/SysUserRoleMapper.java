package com.luqiyu.kitty.admin.dao;

import com.luqiyu.kitty.admin.model.SysRoleDept;
import com.luqiyu.kitty.admin.model.SysUserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserRoleMapper {
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
    int insert(SysUserRole record);

    /**
     * 新增，可部分字段
     *
     * @param record 新增实体
     * @return 影响行
     */
    int insertSelective(SysUserRole record);

    /**
     * 根据id查询
     *
     * @param id 实体id
     * @return 影响行
     */
    SysUserRole selectByPrimaryKey(Long id);

    /**
     * 查询全部
     *
     * @return 实体列表
     */
    List<SysUserRole> selectAll();

    /**
     * 根据id更新，要求全部字段不为空
     *
     * @param record 实体
     * @return 影响行
     */
    int updateByPrimaryKey(SysUserRole record);

    /**
     * 根据id更新，可部分字段
     *
     * @param record 实体
     * @return 影响行
     */
    int updateByPrimaryKeySelective(SysUserRole record);

    /**
     * 根据用户id查询角色列表
     *
     * @param userId 用户id
     * @return 角色列表
     */
    List<SysUserRole> findUserRoles(@Param(value = "userId") Long userId);
}