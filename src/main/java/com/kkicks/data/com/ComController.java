package com.kkicks.data.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// controller which handles basic page calls from the web front
@Controller
public class ComController {

    @GetMapping(value="/")
    public String index() {

        return "index";
    }

}
