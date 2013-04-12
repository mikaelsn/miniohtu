package ohtu.miniohtu;

import ohtu.miniohtu.citation.Citation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

    @RequestMapping("/")
    public String indexPage(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping("/list")
    public String listPage(ModelMap model, @ModelAttribute Citation cit) {
        model.addAttribute("message", "Hello world!");
        return "list";
    }

    @RequestMapping("/add")
    public String addPage(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEntry(@ModelAttribute Citation cit) {
        return "redirect:list";
    }
}