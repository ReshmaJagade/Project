package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.app.pojos.*;
import com.app.pojos.Package;
import com.app.service.IMemberService;
import com.app.service.IPackageService;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private IMemberService memberService;
	@Autowired
	private IPackageService packageService;

	@GetMapping("/memberDetails")
	public String showMemberDetails(Model map, @RequestParam String member_userName, HttpSession session) {
		map.addAttribute("user_dtls", session.getAttribute("user_details"));
		map.addAttribute("member_Details", memberService.getMemberByName(member_userName));
		return "/member/memberDetails";
	}

	@GetMapping("/updatePackage")
	public String updatePackage(@RequestParam int id, Model map) {
		System.out.println(id);
		map.addAttribute("update_Package", new Member());

		map.addAttribute("id", id);
		map.addAttribute("all_packages", packageService.getAllPackages());

		return "/member/updatePackage";
	}

	@PostMapping("/updatePackage")
	public String processUpdatePackageForm(@ModelAttribute(name = "update_Package") Member m1,
			@ModelAttribute(name = "id") int id, Model map) {
		System.out.println(id);
		Member m = memberService.getMemberById(id);
		System.out.println(m);
		System.out.println(m1.getSelectedPackage().getId());
		int package_id = m1.getSelectedPackage().getId();
		System.out.println(m.getId());
		memberService.updateMember(m, m.getAllocatedTrainer().getId(), package_id, id);// m.getId()
		map.addAttribute("member_Details", memberService.getMemberByName(m.getUserName()));
		return "/member/memberDetails";
	}

}
