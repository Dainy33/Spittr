package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spittr.data.SpittleRepository;

@Controller
@RequestMapping(value = "/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping
    public String spittles(Model model){
        model.addAllAttributes(spittleRepository.findSpittles(Long.MAX_VALUE,20));
        return "spittles";
    }

}
/**
 * @program: Spittr
 * @description:
 * @author: Dainy33
 * @create: 2018-10-09 17:59
 **/
