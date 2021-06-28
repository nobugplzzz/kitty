package com.luqiyu.kitty.core.page;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luqiyu.kitty.common.utils.ReflectionUtils;

import java.util.List;

/**
 * MyBatis 分页查询助手，统一封装了分页逻辑
 *
 * @author: 启誉
 * @create: 2021-06-27
 **/
public class MybatisPageHelper {
    /**
     * 分页查询方法名
     */
    public static final String findPage = "findPage";

    /**
     * 分页查询, 约定查询方法名为 “findPage”
     * DAO查询方法为findPage，那么只需要传入对应的Mapper, 调用MybatisPageHelper直接返回分页数据即可。
     *
     * @param pageRequest 分页请求
     * @param mapper      Dao对象，MyBatis的 Mapper
     * @return
     */
    public static PageResult findPage(PageRequest pageRequest, Object mapper) {
        return findPage(pageRequest, mapper, findPage);
    }

    /**
     * 调用MybatisPageHelper分页插件进行分页查询，并包装分页信息返回
     *
     * @param pageRequest     分页请求
     * @param mapper          Dao对象，MyBatis的 Mapper
     * @param queryMethodName 要分页的查询方法名
     * @param args            方法参数
     * @return
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static PageResult findPage(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args) {
        // 设置分页参数
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        // PageHelper.startPage 静态方法调用方式分页，紧跟在这个方法后的第一个MyBatis 查询方法会被进行分页。
        PageHelper.startPage(pageNum, pageSize);
        // 利用反射调用查询方法
        Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
        // 用PageInfo对结果进行包装
        return getPageResult(new PageInfo((List) result));
    }

    /**
     * 将包装好的分页信息封装到统一的接口
     *
     * @param pageInfo 分页信息
     * @return
     */
    private static PageResult getPageResult(PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
