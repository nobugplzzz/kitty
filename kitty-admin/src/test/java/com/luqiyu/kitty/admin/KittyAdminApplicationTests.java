package com.luqiyu.kitty.admin;

import com.luqiyu.kitty.admin.dao.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试类
 *
 * @author: 启誉
 * @create: 2021-06-26
 **/
@SpringBootTest
public class KittyAdminApplicationTests {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    void contextLoads() {
        System.out.println(sysUserMapper.selectByPrimaryKey(1L));
    }
}
