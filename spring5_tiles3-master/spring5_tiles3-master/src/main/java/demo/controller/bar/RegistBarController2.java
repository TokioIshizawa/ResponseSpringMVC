package demo.controller.bar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class RegistBarController2 {

    @RequestMapping(value = "/bar/regist/index2", method = RequestMethod.GET)
    public String index(Model model){
        System.out.println("bar/regist/index2");
        model.addAttribute("registBarForm2", new RegistBarForm2());
        return "bar/regist2";
    }

    @RequestMapping(value = "/bar/regist/regist2", method = RequestMethod.POST)
    public String regist(@Valid @ModelAttribute("registBarForm2")RegistBarForm1 registBarForm, BindingResult result){
        System.out.println("regist2");
        if(result.hasErrors()){
            return "bar/regist2";
        }
        System.out.println(registBarForm.getBarName());
        return "redirect:index2";
    }
}
