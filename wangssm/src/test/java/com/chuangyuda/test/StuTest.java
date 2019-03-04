package com.chuangyuda.test;

import com.chuangyuda.dao.StuDao;
import com.chuangyuda.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by OneFly on 2019/2/19.
 */
@Repository
@Transactional
public class StuTest {
    @Test
    public void testDao(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StuDao stuDao = applicationContext.getBean(StuDao.class);
        Student student = stuDao.findById(4);
        System.out.println(student);
    }
}
