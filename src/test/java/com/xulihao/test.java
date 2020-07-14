package com.xulihao;

import com.xulihao.config.Config;
import com.xulihao.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(connection);
    }

    @Test
    public void annotest() {
        ApplicationContext application = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = (UserService) application.getBean("userServiceImpl");
        userService.save();
    }
    /*
    测试纯注解配置数据库
     */
    @Test
    public void annotest2() {
        ApplicationContext application = new AnnotationConfigApplicationContext(Config.class);
        DataSource dataSource = (DataSource) application.getBean("dataSource");
        Connection connection=null;
        try {
            connection=dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("!!"+connection);
    }
}
