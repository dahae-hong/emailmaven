package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	EmailService service;
	
	
@RequestMapping("/emailform")
public String emailform() {
	return "/WEB-INF/view/emailform.jsp";
}
@RequestMapping("/sendemail")
public String sendemail(String email, String subject, String content) {
	service.sendemail(email, subject, content);
	return "/WEB-INF/view/emailform.jsp";

} 
}
