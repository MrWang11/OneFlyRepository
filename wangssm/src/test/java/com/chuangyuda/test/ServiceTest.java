package com.chuangyuda.test;

import com.chuangyuda.domain.Student;
import com.chuangyuda.service.StuService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by OneFly on 2019/2/19.
 */
public class ServiceTest {
    @Test
    public void testService(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StuService stuService = applicationContext.getBean(StuService.class);
        Student student = stuService.findById(3);
        System.out.println(student);
    }
}
