package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index1 {
    @RequestMapping(value = "/1")
    public String index(){
        return "index1";
    }
}
