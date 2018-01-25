package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index2 {
    @RequestMapping(value = "/2")
    public String index(){
        return "index2";
    }
}
