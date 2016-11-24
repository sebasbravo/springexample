package com.momentum.exemple2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.momentum.exemple2.dao.UserDAO;
import com.momentum.exemple2.model.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value="/")
	public ModelAndView home(){
		List<User> listUsers = userDAO.list();
		ModelAndView model = new ModelAndView("home");
		model.addObject("userList", listUsers);
		return model;
	}
	

}
