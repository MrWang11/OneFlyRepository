package com.chuangyuda.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by OneFly on 2019/2/19.
 */
@Data
public class Student implements Serializable{
    private Integer cust_id;
    private String cust_name;
    private String cust_address;
}
