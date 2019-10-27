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

import com.exam.model.PersonalDetails;
import com.exam.model.Training;
import com.exam.service.PersonalDetailsService;
import com.exam.service.TrainingService;


@Controller
public class PersonalDetailsController {
	@Autowired
	PersonalDetailsService personalDetailsService;
	
	@GetMapping(value = "/personaldetails")
	public ModelAndView getPersonalDetailsPage() {
		System.out.println("Ok");
		return new ModelAndView("pages/personaldetails");
	}
	
	
	@PostMapping("/personalDetailsRegistration")
	public ModelAndView trainingRegistration(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String fatherName = request.getParameter("fatherName");
		String motherName = request.getParameter("motherName");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String religion = request.getParameter("religion");
		String maritalStatus = request.getParameter("maritalStatus");
		String nationality = request.getParameter("nationality");
		String nidNo = request.getParameter("nidNo");
		String passportNo = request.getParameter("passportNo");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String altEmail = request.getParameter("altEmail");
		
		PersonalDetails pd = new PersonalDetails();
		
		pd.setFirstName(firstName);
		pd.setLastName(lastName);
		pd.setFatherName(fatherName);
		pd.setMotherName(motherName);
		pd.setDob(dob);
		pd.setGender(gender);
		pd.setReligion(religion);
		pd.setMaritalStatus(maritalStatus);
		pd.setNationality(nationality);
		pd.setNidNo(nidNo);
		pd.setPassportNo(passportNo);
		pd.setMobile(mobile);
		pd.setEmail(email);
		pd.setAltEmail(altEmail);
		
		pd = personalDetailsService.save(pd);
		
		if (pd != null) {
			model.put("success", true);
			model.put("message", "Save Successful");
			return new ModelAndView("index", model);
		}else {
			model.put("error", false);
			model.put("message", "Save failed");
			return new ModelAndView("pages/personaldetails", model);
		}
		
	}
	@GetMapping("/show-personalDetails")
	public ModelAndView showAll() {
		Map<String, Object> model = new HashMap<>();
		List<PersonalDetails> entityList  = personalDetailsService.getAll();
		model.put("personalDetailsList", entityList);
		return new ModelAndView("pages/show-personaldetails", model);
	}
	
	@GetMapping("/personalDetails/edit/{id}")
	public ModelAndView edit(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		PersonalDetails entity = personalDetailsService.getById(id);
		model.put("personalDetailsEntity", entity);
		return new ModelAndView("pages/personaldetails-edit", model);
	}
	
	@PostMapping("/updatePersonalDetails")
	public ModelAndView updateUser(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String fatherName = request.getParameter("fatherName");
		String motherName = request.getParameter("motherName");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String religion = request.getParameter("religion");
		String maritalStatus = request.getParameter("maritalStatus");
		String nationality = request.getParameter("nationality");
		String nidNo = request.getParameter("nidNo");
		String passportNo = request.getParameter("passportNo");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String altEmail = request.getParameter("altEmail");
		
		PersonalDetails pd = new PersonalDetails();
		
		pd.setFirstName(firstName);
		pd.setLastName(lastName);
		pd.setFatherName(fatherName);
		pd.setMotherName(motherName);
		pd.setDob(dob);
		pd.setGender(gender);
		pd.setReligion(religion);
		pd.setMaritalStatus(maritalStatus);
		pd.setNationality(nationality);
		pd.setNidNo(nidNo);
		pd.setPassportNo(passportNo);
		pd.setMobile(mobile);
		pd.setEmail(email);
		pd.setAltEmail(altEmail);

		pd = personalDetailsService.update(pd);
		
		List<PersonalDetails> entityList  = personalDetailsService.getAll();
		
		model.put("personalDetailsList", entityList);
		
		return new ModelAndView("pages/show-personaldetails", model);
	}
	
	@GetMapping("/personalDetails/delete/{id}")
	public ModelAndView delete(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		 boolean delete_personalDetails = personalDetailsService.delete(id);
		 
		 if (delete_personalDetails) {
				model.put("success", true);
				model.put("message", "Delete Successful");
				List<PersonalDetails> entityList  = personalDetailsService.getAll();
				model.put("personalDetailsList", entityList);
			return new ModelAndView("pages/show-personaldetails", model);
			}else {
				model.put("error", false);
				model.put("message", "Delete failed");
				return new ModelAndView("pages/personaldetails", model);
			}
		 
		
	}
}
