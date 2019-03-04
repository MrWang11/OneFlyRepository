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
@RequestMapping("/gan")
public class BiaoController {

    @Autowired
    private StuService stuService;

    @RequestMapping("/shibiao")
    public String shiBiao(Model model){
        Student byId = stuService.findById(2);
        model.addAttribute("biao",byId);
        return "biao";
    }
}
