package com.chuangyuda.controller;

import com.chuangyuda.domain.Student;
import com.chuangyuda.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by OneFly on 2019/2/19.
 */
@Controller
@RequestMapping("/controller")
public class stuController {

    @Autowired
    private StuService stuService;

    @RequestMapping("/showdetail")
    public String showDetail(Model model){
        Student byId = stuService.findById(10);
        model.addAttribute("data",byId);
        return "student";
    }
}
