package com.chuangyuda.dao;

import com.chuangyuda.domain.Student;
import org.apache.ibatis.annotations.Select;

/**
 * Created by OneFly on 2019/2/19.
 */
public interface StuDao {

    @Select("select * from spring_boot where cust_id = #{id}")
    public Student findById(Integer id);
}
