package bible.meditation.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@Controller
public class studentFormController {

    @GetMapping("student-form")
    public String thinkIn(Model model){
        //String thinkInData = request.getParameter("");
        // points the request to the view
        return "student-form";
    }

}
