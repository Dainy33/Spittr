package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
/**
 * @program: Spittr
 * @description:
 * @author: Dainy33
 * @create: 2018-10-09 13:44
 **/
