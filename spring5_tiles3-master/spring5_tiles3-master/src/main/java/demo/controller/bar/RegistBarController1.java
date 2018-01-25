package demo.controller.bar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class RegistBarController1 {

    @RequestMapping(value = "/bar/regist/index1", method = RequestMethod.GET)
    public String index(Model model){
        System.out.println("bar/regist/index1");
        model.addAttribute("registBarForm1", new RegistBarForm1());
        return "bar/regist1";
    }

    @RequestMapping(value = "/bar/regist/regist1", method = RequestMethod.POST)
    public String regist(@Valid @ModelAttribute("registBarForm1")RegistBarForm1 registBarForm, BindingResult result){
        System.out.println("regist1");
        if(result.hasErrors()){
            return "bar/regist1";
        }
        System.out.println(registBarForm.getBarName());
        return "redirect:index1";
    }
}
