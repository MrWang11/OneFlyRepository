package com.chuangyuda.controller;

import com.chuangyuda.domain.Student;
import com.chuangyuda.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by OneFly on 2019/2/20.
 */
@Controller
@RequestMapping("/song")
public class NaController {

    @Autowired
    private StuService stuService;

    @RequestMapping("/nana")
    public String fingNaNa(Model model){
        Student nana = stuService.findById(9);
        model.addAttribute("friend",nana);
        return "friend";
    }
}
