package com.drs.test.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.drs.test.demo.Entities.User;
import com.drs.test.demo.Repositories.CRUDRepo;
import com.google.gson.Gson;

@RestController
@RequestMapping("/login")
public class LoginController {


	@Autowired
	private CRUDRepo repo;

	@GetMapping("/all")
	public ModelAndView Login(){
		ModelAndView mav = new ModelAndView("view");
		Gson gson = new Gson();
	    String json = gson.toJson((List<User>) repo.findAll());
		mav.addObject("response", json);
		return mav;
	}

	@GetMapping("/all.json")
	public String LoginJson(){
		Gson gson = new Gson();
		String json = gson.toJson((List<User>) repo.findAll());
		return json;
	}

}
