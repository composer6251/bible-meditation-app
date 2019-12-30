package bible.meditation.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@Controller
public class thinkUpController {

    @GetMapping("thinkUp")
    public String thinkUp(Model model){

        // points the request to the view
        return "thinkUp";
    }

}
