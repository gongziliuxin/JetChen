package com.java.test;


import com.java.bean.Stuff;
import com.java.dao.StuffMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/*
* 测试dao工作层
*
* 推荐谁用spring单元测试，可以自动注入我们需要的组件
* 1.导入SpringTest模块
* 2.ContextConfiguration指定spring配置文件的位置
* 3.直接Autowired
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class mapperTest {
    @Autowired
    StuffMapper stuffMapper;

//    @Autowired
//    SqlSession sqlSession;
    @Test
    public void testCRUD(){
//        //1.创建springIOC容器
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2.从容器中获取mapper
//        ioc.getBean(StuffExample.class);
        System.out.println(stuffMapper);
        //1，插入测试
        stuffMapper.insert(new Stuff("S0003","123","tom","男","510322194512308193","1945-12-30","73","西北大学","13675305619","B"));
        //2.批量处理
//        StuffMapper stuffMapper=sqlSession.getMapper(StuffMapper.class);
//        for(int i=0;i<1000;i++){
//            String uid=UUID.randomUUID().toString().substring(0,5)+i;
//            String sid= "S"+i;
//            stuffMapper.insertSelective(new Stuff("","123",uid,"男","510322194512308193","1945-12-30","73","西北大学","13675305618","A"));
//        }
    }
}
