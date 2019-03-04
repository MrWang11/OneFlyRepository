package com.chuangyuda.service.serviceImpl;

import com.chuangyuda.dao.StuDao;
import com.chuangyuda.domain.Student;
import com.chuangyuda.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;

/**
 * Created by OneFly on 2019/2/19.
 */
@Service
@Transactional
@WebService
public class StuServiceImpl implements StuService{

    @Autowired
    private StuDao stuDao;

    @Override
    public Student findById(Integer id) {
        return stuDao.findById(id);
    }

}
