package in.co.rmswebsolutions.idonate.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/web")
public class HomepageController {

	@RequestMapping (value = "/home")
	public ModelAndView home(){
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Home");
		return model;
	}
	
}
