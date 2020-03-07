package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoginModel;
import com.example.demo.ServiceInterface.ILoginService;

@RestController
public class LoginController {
	
	@Autowired
	ILoginService loginService;
	
	@RequestMapping(value="/login/{userName}/{password}")
	public String Login(@PathVariable String userName,@PathVariable String password) {
		LoginModel loginModel=new LoginModel();
		loginModel.setUserName(userName);
		loginModel.setPassword(password);
		boolean test= loginService.Login(loginModel);
		if(test) {
		return ("<h1>welcome!</h1>");
		}else {
			return ("<h1>Not Authorized</h1>");
		}
	}
}
