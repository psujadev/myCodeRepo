package com.example.demo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoginModel;
import com.example.demo.Repository.LoginDataAccess;
import com.example.demo.ServiceInterface.ILoginService;

@Service
public class LoginService implements ILoginService{

	@Autowired
	LoginDataAccess loginDataAccess;
	
	@Override
	public boolean Login(LoginModel loginModel) {
		// TODO Auto-generated method stub
		return loginDataAccess.LoginAccess(loginModel);
	}

}
