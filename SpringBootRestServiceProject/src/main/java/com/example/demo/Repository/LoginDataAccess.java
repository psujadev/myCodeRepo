package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.LoginModel;

@Repository
public class LoginDataAccess {
	
	@Autowired
	private ILoginReposiory loginReposiory;
	
	public boolean LoginAccess(LoginModel loginModel) {
		Optional<LoginModel> loginModels=loginReposiory.findById(loginModel.getUserName());
		if(loginModels.isPresent()) {
			return loginModels.filter(					
					a->a.getPassword().equalsIgnoreCase(loginModel.getPassword()) &&
					a.getUserName().equalsIgnoreCase(loginModel.getUserName())).isPresent();
		}
		return false;
	}
}
