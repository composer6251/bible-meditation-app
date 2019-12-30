package bible.meditation.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@Controller
public class thinkOutController {

    /*******@GetMapping directs the request to this method. i.e. what is in the parentheses is what is in the URL*******/
    @GetMapping("/thinkOut")
    public String thinkIn(Model model){
        //String thinkInData = request.getParameter("");

        log.info("In ThinkIN. GetMapping");
        // points the request to the view
        return "thinkOut";
    }

    // controller method to process the HTML form USING @REQUESTPARAM
    //HttpServletRequest request,  replaced by @REQUESTPARAM

    //@RequestMapping("/processMainFormWith@RequestParam")
    @GetMapping("/processMainFormWith@RequestParam")
    public String processForm(@RequestParam("thinkOut") String input, Model model) {

        log.info("In processForm");

        //convert the data to all caps
        input = input.toUpperCase();

        //create the message
        String message = "Here is what you wrote with @RequestParam: " + input;

        //add the message to the model
        model.addAttribute("message", message);

        log.info("model in processForm " + model);

        //direct to thinkOut.jsp
        return "thinkOut";
    }

    // controller method to process the HTML form
    @RequestMapping("/processMainForm")
    public String processForm(HttpServletRequest request, Model model) {

        log.info("In processForm");
        //read request parameter from html form (name from form in main.jsp)
        String input = request.getParameter("thinkOut");

        //convert the data to all caps
        input = input.toUpperCase();

        //create the message
        String message = "Here is what you wrote: " + input;

        //add the message to the model
        model.addAttribute("message", message);

        log.info("model in processForm " + model);

        //direct to thinkOut.jsp
        return "thinkOut";
    }
}
