package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.LoginModel;

public interface ILoginReposiory extends CrudRepository<LoginModel, String> {

}
