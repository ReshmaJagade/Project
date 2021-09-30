package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.pojos.Member;
import com.app.service.IMemberService;
import com.app.service.IPackageService;
import com.app.service.ITrainerService;

@Controller
public class HomeController {

	@Autowired
	private ITrainerService trainerService;
	@Autowired
	private IMemberService memberService;
	@Autowired
	private IPackageService packageService;

	public HomeController() {
		System.out.println("in ctor of " + getClass().getName());
	}
	// add req handling method to forward the clnt to the home page(index.jsp)
//	@RequestMapping("/")
//	public String showHomePage()
//	{
//		System.out.println("in show home page");
//		return "/index";//AVN : /WEB-INF/views/index.jsp
//	}

	@RequestMapping("/")
	public String showHomePage(Model map) {
		System.out.println("in show home page");
		map.addAttribute("count_member", memberService.countMembers());
		map.addAttribute("count_package", packageService.countPackage());
		return "/index";// AVN : /WEB-INF/views/index.jsp
	}

	@GetMapping("/Registration")
	public String showMemberForm(Model map) {
		map.addAttribute("trainer_info", trainerService.getAllTrainer());
		map.addAttribute("package_info", packageService.getAllPackages());
		map.addAttribute("new_Member", new Member());
		return "/user/registration";
	}

	@PostMapping("/Registration")
	public String processMemberForm(Model map, @ModelAttribute(name = "new_Member") Member m) {
		try {
			Member m1 = memberService.validate(m);

			memberService.addMember(m, m.getAllocatedTrainer().getId(), m.getSelectedPackage().getId());
			// return new String("/index");
			return new String("/user/submitHealthData");
		} catch (Exception e) {
			System.out.println("err in controller " + e);
			map.addAttribute("message", "Invalid password must be min5 char");
			map.addAttribute("trainer_info", trainerService.getAllTrainer());
			map.addAttribute("package_info", packageService.getAllPackages());
			return "/user/registration";
		}
	}

}
