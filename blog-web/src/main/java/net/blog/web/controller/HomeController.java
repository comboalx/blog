package net.blog.web.controller;

//import com.so.webblog.service.PostingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
//    @Autowired
//    private PostingsService postingsService;
    
    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    @Transactional
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("posts", postingsService.list());
        return mv;
    }
    
    @RequestMapping(value = {"/login"})
    public String login(){
        return "login";
    }
    
}
