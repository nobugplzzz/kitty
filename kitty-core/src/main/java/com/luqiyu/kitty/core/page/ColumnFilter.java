package com.luqiyu.kitty.core.page;

/**
 * 分页查询过滤器
 *
 * @author: 启誉
 * @create: 2021-06-27
 **/
public class ColumnFilter {
    /**
     * 过滤列名
     */
    private String name;
    /**
     * 查询的值
     */
    private String value;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
