package bible.meditation.controller;

import bible.meditation.model.ThinkInModel;
import bible.meditation.model.ThinkOutModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class MainController {


    // controller method to show initial HTML Form


    @GetMapping("main")
    public String main(Model model){
        log.info("MainController.main");
        model.addAttribute("thinkInModel", new ThinkInModel());

        log.info("model = {}", model);

        return "main";
    }






    //Send requests to this directory/showForm (this method)
//    @RequestMapping("/showForm")
//    public String showForm(Model model) {
//
//        model.addAttribute("thinkOut", new ThinkOutModel());
//        model.addAttribute("thinkIn");
//
//        return "main";
//    }

}
