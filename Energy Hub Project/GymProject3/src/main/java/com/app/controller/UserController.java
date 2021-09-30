package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.User;
import com.app.pojos.UserRole;
import com.app.service.IMemberService;
import com.app.service.IPackageService;
import com.app.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	IUserService userService;
	@Autowired
	private IMemberService memberService;
	@Autowired
	private IPackageService packageService;
	
	public UserController() {
		System.out.println("in cnstr of "+getClass().getName());
	}
	
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/user/login";
	}
	
	
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String username,@RequestParam String password,HttpSession session,Model map) {
		try {
		User user=userService.validateUser(username,password);
		session.setAttribute("user_details", user);
		if(user.getRole().equals(UserRole.ADMIN))
		    return "/admin/adminManagement";
		else if(user.getRole().equals(UserRole.TRAINER))
		
			return "/trainer/trainerManagement";
		else
		{
			map.addAttribute("user_dtls", session.getAttribute("user_details"));
			return "/member/memberManagement";
	}
		}
		catch(RuntimeException e)
		{
			System.out.println("err in user controller " + e);
			map.addAttribute("message", "Invalid Login , Please retry !");
			return "/user/login";
		}
		
	}
	
	@GetMapping("/logout")
	public String Logout(HttpSession session,Model map,HttpServletResponse resp,HttpServletRequest request) {
		map.addAttribute("user_dtls", session.getAttribute("user_details"));
		//How to navigate the clnt auto to the next pager after some dly ?
				//set resp header : refresh value : 10;url=home page
		map.addAttribute("count_member", memberService.countMembers());
		map.addAttribute("count_package", packageService.countPackage());
			resp.setHeader("refresh", "5;url=/");
				session.invalidate();
				return "/user/logout";
	
	}
	
}
