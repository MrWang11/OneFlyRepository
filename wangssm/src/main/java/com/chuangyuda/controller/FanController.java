package com.chuangyuda.controller;

import com.chuangyuda.domain.Student;
import com.chuangyuda.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by OneFly on 2019/2/21.
 */
@Controller
@RequestMapping("/zhang")
public class FanController {

    @Autowired
    private StuService stuService;

    @RequestMapping("/fanfan")
    public String fanfan(Model model){
        Student byId = stuService.findById(11);
        model.addAttribute("fanfan",byId);
        return "fanfan";
    }
}
