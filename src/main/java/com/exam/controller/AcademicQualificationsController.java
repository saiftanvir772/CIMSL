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
import com.exam.model.Training;
import com.exam.service.AcademicQualificationsService;
import com.exam.service.PersonalDetailsService;
import com.exam.service.TrainingService;


@Controller
public class AcademicQualificationsController {
	@Autowired
	AcademicQualificationsService academicQualificationsService;
	
	@GetMapping(value = "/academicqualification")
	public ModelAndView getAcademicQualificationPage() {
		System.out.println("Ok");
		return new ModelAndView("pages/academicqualification");
	}
	
	
	@PostMapping("/academicqualificationRegistration")
	public ModelAndView trainingRegistration(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		
		String educationLevel = request.getParameter("educationLevel");
		String examTitle = request.getParameter("examTitle");
		String concentration = request.getParameter("concentration");
		String institute = request.getParameter("institute");
		String resultType = request.getParameter("resultType");
		String result = request.getParameter("result");
		String scale = request.getParameter("scale");
		String yearOfPassing = request.getParameter("yearOfPassing");
		String duration = request.getParameter("duration");
				
		AcademicQualifications aq = new AcademicQualifications();
		
		aq.setEducationLevel(educationLevel);
		aq.setExamTitle(examTitle);
		aq.setConcentration(concentration);
		aq.setInstitute(institute);
		aq.setResultType(resultType);
		aq.setResult(result);
		aq.setScale(scale);
		aq.setYearOfPassing(yearOfPassing);
		aq.setDuration(duration);
		
		aq = academicQualificationsService.save(aq);
		
		if (aq != null) {
			model.put("success", true);
			model.put("message", "Save Successful");
			return new ModelAndView("index", model);
		}else {
			model.put("error", false);
			model.put("message", "Save failed");
			return new ModelAndView("pages/academicqualification", model);
		}
		
	}
	@GetMapping("/show-academicqualification")
	public ModelAndView showAll() {
		Map<String, Object> model = new HashMap<>();
		List<AcademicQualifications> entityList  = academicQualificationsService.getAll();
		model.put("academicQualificationList", entityList);
		return new ModelAndView("pages/show-academicqualification", model);
	}
	
	@GetMapping("/academicQualification/edit/{id}")
	public ModelAndView edit(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		AcademicQualifications entity = academicQualificationsService.getById(id);
		model.put("academicQualicationEntity", entity);
		return new ModelAndView("pages/academicqualification-edit", model);
	}
	
	@PostMapping("/updateAcademicQualification")
	public ModelAndView updateUser(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String educationLevel = request.getParameter("educationLevel");
		String examTitle = request.getParameter("examTitle");
		String concentration = request.getParameter("concentration");
		String institute = request.getParameter("institute");
		String resultType = request.getParameter("resultType");
		String result = request.getParameter("result");
		String scale = request.getParameter("scale");
		String yearOfPassing = request.getParameter("yearOfPassing");
		String duration = request.getParameter("duration");
				
		AcademicQualifications aq = new AcademicQualifications();
		
		aq.setEducationLevel(educationLevel);
		aq.setExamTitle(examTitle);
		aq.setConcentration(concentration);
		aq.setInstitute(institute);
		aq.setResultType(resultType);
		aq.setResult(result);
		aq.setScale(scale);
		aq.setYearOfPassing(yearOfPassing);
		aq.setDuration(duration);

		aq = academicQualificationsService.update(aq);
		
		List<AcademicQualifications> entityList  = academicQualificationsService.getAll();
		
		model.put("academicQualificationList", entityList);
		
		return new ModelAndView("pages/show-academicqualification", model);
	}
	
	@GetMapping("/academicQualification/delete/{id}")
	public ModelAndView delete(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		 boolean delete_academicqualification = academicQualificationsService.delete(id);
		 
		 if (delete_academicqualification) {
				model.put("success", true);
				model.put("message", "Delete Successful");
				List<AcademicQualifications> entityList  = academicQualificationsService.getAll();
				model.put("personalDetailsList", entityList);
			return new ModelAndView("pages/show-academicqualification", model);
			}else {
				model.put("error", false);
				model.put("message", "Delete failed");
				return new ModelAndView("pages/academicqualification", model);
			}
		 
		
	}
}
