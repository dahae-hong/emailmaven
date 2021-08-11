package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class URLTestController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello world";
	}
	@RequestMapping("/pagetest")
	public String pagetest() {
		return "/WEB-INF/view/viewtest.jsp";
	}
	@RequestMapping("/datatest")
	public String datatest(ModelMap modelmap) {
		modelmap.put("name", "hongkildong");
		return "/WEB-INF/view/viewtest.jsp";
	}
	@RequestMapping("/modeldatatest")
	public ModelAndView modeldatatest() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","hongkildong");
		mv.setViewName("/WEB-INF/view/viewtest.jsp");
		return mv;
	}
	@RequestMapping("/formtest")
	public String formtest() {
		return "/WEB-INF/view/formtest.jsp";
	}
	@RequestMapping("/formtestProc")
	@ResponseBody
	public String formtestProc(String name) {
		return name;
	}
	@RequestMapping("/formtest1")
	public String formtest1() {
		return "/WEB-INF/view/formtest1.jsp";
	}
	@RequestMapping("/formtestProc1")
	@ResponseBody
	public String formtestProc1(String name, Model model) {
		model.addAttribute("name",name);
		return "/WEB-INF/view/viewtest.jsp";
	}
}
