package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/","homepage"})
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
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
