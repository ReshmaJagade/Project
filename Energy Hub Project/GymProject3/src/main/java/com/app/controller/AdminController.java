package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.custom_exception.BranchHandlingException;
import com.app.custom_exception.DuplicateEntryException;
import com.app.pojos.Batch;
import com.app.pojos.Member;
import com.app.pojos.Package;
import com.app.pojos.Trainer;
import com.app.service.IBatchService;
import com.app.service.IBranchService;
import com.app.service.IMemberService;
import com.app.service.IPackageService;
import com.app.service.ITrainerService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private ITrainerService trainerService;
	@Autowired
	private IMemberService memberService;
	@Autowired
	private IPackageService packageService;
	@Autowired
	private IBatchService batchService;
	@Autowired
	private IBranchService branchService;

	public AdminController() {
		System.out.println("in cnstr of " + getClass().getName());
	}

	@GetMapping("/batch")
	public String showBatchesRecord() {
		return "/admin/batch";
	}

	// All trainer related
	/******************************/

	@GetMapping("/trainerRecord")
	public String showTrainerRecord(Model map) {
		map.addAttribute("trainer_details", trainerService.getAllTrainer());
		return "/admin/trainer";
	}

	@GetMapping("/trainerForm")
	public String showTrainerForm(Model map) {
		map.addAttribute("new_Trainer", new Trainer());
		return "/admin/trainerform";
	}
//
//	@PostMapping("/trainerForm")
//	public String AddTrainer(@ModelAttribute(name = "new_Trainer") Trainer newTrainer, Model map) 
//{
//	String msg=trainerService.validate(newTrainer);
//	if(msg.contains("successful"))
//	{
//		trainerService.addTrainer(newTrainer);
//		map.addAttribute("trainer_details", trainerService.getAllTrainer());
//		return "/admin/trainer";
//	}
//	else {
//		throw new BranchHandlingException("Enter correct password length should be 5");
//	}
//}

	
	@PostMapping("/trainerForm")
	public String AddTrainer(@ModelAttribute(name = "new_Trainer") Trainer newTrainer, Model map) {
		try {
			Trainer t = trainerService.validate(newTrainer);
			trainerService.addTrainer(newTrainer);
			map.addAttribute("trainer_details", trainerService.getAllTrainer());
			return "/admin/trainer";
		} catch (Exception e) {
			System.err.println("err in admin controller" + e);
			map.addAttribute("message", "Invalid password must be min5 char");
			map.addAttribute("message1", "Password and Confirm must be same");
			map.addAttribute("message2", "Duplicate trainer ");
			return "/admin/trainerform";
		}
	}
	
	@GetMapping("/updateTrainerForm")
	public String showUpdateTrainerForm(@RequestParam int trainer_id, Model map) {

		System.out.println(trainer_id);
		Trainer t=trainerService.getTrainerById(trainer_id);
		// System.out.println(t.getId());
		 map.addAttribute("old_trainer",t);
		map.addAttribute("id", trainer_id);
		map.addAttribute("update_Trainer", new Trainer());
		return "/admin/updatetrainerform";
	}
	

	@PostMapping("/updateTrainerForm")
	public String processUpdateTrainerForm(@ModelAttribute(name = "update_Trainer") 
	Trainer updatedTrainer, Model map,@ModelAttribute(name = "id") int id) {
		// System.out.println(id);
		// System.out.println(updatedTrainer.getId());
		trainerService.updateTrainer(updatedTrainer, id);
		map.addAttribute("trainer_details", trainerService.getAllTrainer());
		return "/admin/trainer";
	}

	@GetMapping("/deleteTrainer")
	public String deleteTrainer(@RequestParam int trainer_id, Model map) {
		trainerService.deleteTrainer(trainer_id);
		map.addAttribute("trainer_details", trainerService.getAllTrainer());
		return "/admin/trainer";
	}

	// All member related
	/******************************/
	@GetMapping("/memberRecord")
	public String showMemberRecord(Model map) {
		map.addAttribute("member_details", memberService.getAllMember());
		return "/admin/member";
	}

	@GetMapping("/memberForm")
	public String showMemberForm(Model map) {
		map.addAttribute("trainer_info", trainerService.getAllTrainer());
		map.addAttribute("package_info", packageService.getAllPackages());
		map.addAttribute("new_Member", new Member());
		return "/admin/memberform";
	}

	@PostMapping("/memberForm")
	public String processMemberForm(Model map, @ModelAttribute(name = "new_Member") Member m) {

		try {
			Member m1 = memberService.validate(m);

			memberService.addMember(m, m.getAllocatedTrainer().getId(), m.getSelectedPackage().getId());
			map.addAttribute("member_details", memberService.getAllMember());
			return "/admin/member";
		} catch (Exception e) {
			System.err.println("err in admin controller" + e);
			map.addAttribute("message", "Invalid password must be min5 char");
			map.addAttribute("message1", "Duplicate Member ");
			map.addAttribute("trainer_info", trainerService.getAllTrainer());
			map.addAttribute("package_info", packageService.getAllPackages());
			return "/admin/memberform";

		}
	}	
	
	@GetMapping("/updateMemberForm")
	public String showUpdateMemberForm(@RequestParam int member_id, Model map) {
		System.out.println(member_id);
		map.addAttribute("trainer_info", trainerService.getAllTrainer());
		map.addAttribute("package_info", packageService.getAllPackages());
		map.addAttribute("id", member_id);
		map.addAttribute("old_member",memberService.getMemberById(member_id));
		map.addAttribute("updated_Member", new Member());
		return "/admin/updatememberform";
	}
	

	@PostMapping("/updateMemberForm")
	public String processUpdateMemberForm(@ModelAttribute(name = "updated_Member") Member m,
			@ModelAttribute(name = "id") int id, Member updatedMember, Model map) {

		memberService.updateMember(updatedMember, updatedMember.getAllocatedTrainer().getId(),
				updatedMember.getSelectedPackage().getId(), id);
		map.addAttribute("member_details", memberService.getAllMember());
		return "/admin/member";
	}

	@GetMapping("/deleteMember")
	public String deleteMember(@RequestParam int member_id, Model map) {
		memberService.deleteMember(member_id);
		map.addAttribute("member_details", memberService.getAllMember());
		return "/admin/member";

	}

	/******************************/

	@GetMapping("/packageRecord")
	public String showPackagesRecord(Model map) {
		map.addAttribute("package_details", packageService.getAllPackages());
		return "/admin/package";
	}

	@GetMapping("/packageForm")
	public String showPackageForm(Model map) {
		map.addAttribute("new_Package", new Package());
		return "/admin/packageform";
	}

//	@PostMapping("/packageForm")
//	public String AddPackage(@ModelAttribute(name = "new_Package") Package newPackage, Model map) {
//
//		packageService.addPackage(newPackage);
//		map.addAttribute("package_details", packageService.getAllPackages());
//		return "/admin/package";
//	}

	@PostMapping("/packageForm")
	public String AddPackage(@ModelAttribute(name = "new_Package") Package newPackage, Model map) {
		try {
			Package p = packageService.addPackage(newPackage);
			map.addAttribute("package_details", packageService.getAllPackages());
			return "/admin/package";
		} catch (Exception e) {
			System.out.println("err in admin controller " + e);
			map.addAttribute("message", "Duplicate package ");
			return "/admin/packageform";
		}
	}

	@GetMapping("/updatePackageForm")
	public String showUpdatePackageForm(@RequestParam int package_id ,Model map) {
		System.out.println(package_id);
		map.addAttribute("id", package_id);
		map.addAttribute("old_package",packageService.getPackageById(package_id));
		map.addAttribute("update_Package", new Package());
		return "/admin/updatepackageform";
	}

	@PostMapping("/updatePackageForm")
	public String processUpdatePackageForm(@ModelAttribute(name = "update_Package") Package updatedPackage, Model map,
			@ModelAttribute(name = "id") int id) {
		packageService.updatePackageDetails(updatedPackage, id);
		map.addAttribute("package_details", packageService.getAllPackages());
		return "/admin/package";
	}

	@GetMapping("/deletePackage")
	public String deletePackage(@RequestParam int package_id, Model map) {
		packageService.deletePackage(package_id);
		map.addAttribute("package_details", packageService.getAllPackages());
		return "/admin/package";
	}
	// Batch
	// details***********************************************************************

	@GetMapping("/batchRecord")
	public String showBatchesRecord(Model map) {
		map.addAttribute("batch_details", batchService.getAllBatch());
		return "/admin/batch";
	}

	@GetMapping("/batchForm")
	public String showBatchForm(Model map) {
		map.addAttribute("trainer_info", trainerService.getAllTrainer());
		map.addAttribute("branch_info", branchService.getAllBranches());
		map.addAttribute("new_Batch", new Batch());
		return "/admin/batchform";
	}

//	@PostMapping("/batchForm")
//	public String AddBatch(@ModelAttribute(name = "new_Batch") Batch b, Model map) {
//
//		batchService.addBatch(b, b.getAllocatedTrainer().getId(), b.getBranchEnrolled().getId());
//		map.addAttribute("batch_details", batchService.getAllBatch());
//		return "/admin/batch";
//	}

	@PostMapping("/batchForm")
	public String AddBatch(@ModelAttribute(name = "new_Batch") Batch b, Model map) {
		try {
			Batch b1 = batchService.addBatch(b, b.getAllocatedTrainer().getId(), b.getBranchEnrolled().getId());
			map.addAttribute("batch_details", batchService.getAllBatch());
			return "/admin/batch";
		} catch (Exception e) {
			System.out.println("err in admin controller " + e);
			map.addAttribute("message", "Duplicate Batch");
			return "/admin/batchform";

		}
	}

	@GetMapping("/updateBatchForm")
	public String showUpdateBatchForm(@RequestParam int batch_id, Model map) {
		System.out.println(batch_id);
		map.addAttribute("id", batch_id);
		map.addAttribute("old_batch",batchService.getBatchById(batch_id));
		map.addAttribute("trainer_info", trainerService.getAllTrainer());
		map.addAttribute("branch_info", branchService.getAllBranches());	
		map.addAttribute("update_Batch", new Batch());
		return "/admin/updatebatchform";
	}

	@PostMapping("/updateBatchForm")
	public String processUpdateBatchForm(@ModelAttribute(name = "update_Batch") Batch b,
			@ModelAttribute(name = "id") int id, Batch updatedBatch, Model map) {
		batchService.addBatch(updatedBatch, updatedBatch.getAllocatedTrainer().getId(),
				updatedBatch.getBranchEnrolled().getId());
		map.addAttribute("batch_details", batchService.getAllBatch());
		return "/admin/batch";
	}

	@GetMapping("/deleteBatch")
	public String deleteBatch(@RequestParam int batch_id, Model map) {
		batchService.deleteBatch(batch_id);
		map.addAttribute("batch_details", batchService.getAllBatch());
		return "/admin/batch";
	}

}
