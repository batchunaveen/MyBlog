package com.naveen.projects.myblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CardsController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
