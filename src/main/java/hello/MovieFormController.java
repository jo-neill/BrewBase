package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieFormController {

    @GetMapping("/add-data")
    public String movieForm(Model model) {
        model.addAttribute("movieForm", new MovieForm());
        return "movieForm";
    }

    @PostMapping("/add-data")
    public String movieFormSubmit(@ModelAttribute MovieForm movieForm) {
        return "thankyou";
    }

}

