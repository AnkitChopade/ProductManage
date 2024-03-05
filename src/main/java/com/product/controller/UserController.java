
package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.product.entity.UserDtls;
import com.product.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/reg")
	public String User(Model m) {

		return "RegForm";
	}

	@GetMapping("/Userlist")
	public String SaveUser(Model n) {

		List<UserDtls> list = userRepo.findAll();
		n.addAttribute("all_user", list);

		return "home";
	}

	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") UserDtls user) {

		System.out.println(user);
		return "home";
	}

}
