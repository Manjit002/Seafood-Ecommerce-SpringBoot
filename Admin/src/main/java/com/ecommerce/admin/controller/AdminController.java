package com.ecommerce.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminController {

    @GetMapping("/charts")
    public String chartss(){

        return "charts";
    }

    @GetMapping("/tables")
    public String tabless(){

        return "tables";
    }

    @GetMapping("/404")
    public String four04(){

        return "404";
    }


}
