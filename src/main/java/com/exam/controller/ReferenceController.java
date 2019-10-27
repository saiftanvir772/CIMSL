package com.exam.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.AcademicQualifications;
import com.exam.model.PersonalDetails;
import com.exam.model.ReferenceDetails;
import com.exam.model.Training;
import com.exam.service.AcademicQualificationsService;
import com.exam.service.PersonalDetailsService;
import com.exam.service.ReferenceDetailsService;
import com.exam.service.TrainingService;


@Controller
public class ReferenceController {
	@Autowired
	ReferenceDetailsService referenceDetailsService;
	
	@GetMapping(value = "/referencedetailsservice")
	public ModelAndView getTrainingPage() {
		System.out.println("Ok");
		return new ModelAndView("pages/referencedetails");
	}
	
	
	@PostMapping("/referencedetailsRegistration")
	public ModelAndView trainingRegistration(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		
		String name = request.getParameter("name");
		String organization = request.getParameter("organization");
		String designation = request.getParameter("designation");
		String phone = request.getParameter("phone");
		String mobileNo = request.getParameter("mobileNo");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String relation = request.getParameter("relation");
		
				
		ReferenceDetails rd = new ReferenceDetails();
		
		rd.setName(name);
		rd.setOrganization(organization);
		rd.setDesignation(designation);
		rd.setPhone(phone);
		rd.setMobileNo(mobileNo);
		rd.setEmail(email);
		rd.setAddress(address);
		rd.setRelation(relation);
		
		rd = referenceDetailsService.save(rd);
		
		if (rd != null) {
			model.put("success", true);
			model.put("message", "Save Successful");
			return new ModelAndView("index", model);
		}else {
			model.put("error", false);
			model.put("message", "Save failed");
			return new ModelAndView("pages/referencedetails", model);
		}
		
	}
	@GetMapping("/show-referencedetails")
	public ModelAndView showAll() {
		Map<String, Object> model = new HashMap<>();
		List<ReferenceDetails> entityList  = referenceDetailsService.getAll();
		model.put("referenceDetailsList", entityList);
		return new ModelAndView("pages/show-referencedetails", model);
	}
	
	@GetMapping("/referencedetails/edit/{id}")
	public ModelAndView edit(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		ReferenceDetails entity = referenceDetailsService.getById(id);
		model.put("referenceDetailsEntity", entity);
		return new ModelAndView("pages/referencedetails-edit", model);
	}
	
	@PostMapping("/updateReferenceDetails")
	public ModelAndView updateUser(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String name = request.getParameter("name");
		String organization = request.getParameter("organization");
		String designation = request.getParameter("designation");
		String phone = request.getParameter("phone");
		String mobileNo = request.getParameter("mobileNo");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String relation = request.getParameter("relation");
		
				
		ReferenceDetails rd = new ReferenceDetails();
		
		rd.setName(name);
		rd.setOrganization(organization);
		rd.setDesignation(designation);
		rd.setPhone(phone);
		rd.setMobileNo(mobileNo);
		rd.setEmail(email);
		rd.setAddress(address);
		rd.setRelation(relation);

		rd = referenceDetailsService.update(rd);
		
		List<ReferenceDetails> entityList  = referenceDetailsService.getAll();
		
		model.put("referenceDetailsList", entityList);
		
		return new ModelAndView("pages/show-referencedetails", model);
	}
	
	@GetMapping("/referencedetails/delete/{id}")
	public ModelAndView delete(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		 boolean delete_referencedetails = referenceDetailsService.delete(id);
		 
		 if (delete_referencedetails) {
				model.put("success", true);
				model.put("message", "Delete Successful");
				List<ReferenceDetails> entityList  = referenceDetailsService.getAll();
				model.put("referenceDetailsList", entityList);
			return new ModelAndView("pages/show-referencedetails", model);
			}else {
				model.put("error", false);
				model.put("message", "Delete failed");
				return new ModelAndView("pages/referencedetails", model);
			}
		 
		
	}
}
