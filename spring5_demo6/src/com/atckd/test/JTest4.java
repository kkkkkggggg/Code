package com.atckd.test;

import com.atckd.service.AccountService;
// import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//指定单元测试框架版本
@ContextConfiguration("classpath:bean1.xml")//加载配置文件
public class JTest4
{
    @Autowired
    private AccountService accountService;

    @Test
    public void test()
    {
        accountService.cheque("1","2",100);
    }

}
