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
import com.exam.model.EmploymentHistory;
import com.exam.model.PersonalDetails;
import com.exam.model.Training;
import com.exam.service.AcademicQualificationsService;
import com.exam.service.EmploymentHistoryService;
import com.exam.service.PersonalDetailsService;
import com.exam.service.TrainingService;


@Controller
public class EmploymentHistoryController {
	@Autowired
	EmploymentHistoryService employmentHistoryService;
	
	@GetMapping(value = "/employmenthistory")
	public ModelAndView getEmploymentHistoryPage() {
		System.out.println("Ok");
		return new ModelAndView("pages/employmenthistory");
	}
	
	
	@PostMapping("/employmenthistoryRegistration")
	public ModelAndView trainingRegistration(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		
		String companyName = request.getParameter("companyName");
		String businessType = request.getParameter("businessType");
		String designation = request.getParameter("designation");
		String department = request.getParameter("department");
		String expertise = request.getParameter("expertise");
		String responsibilities = request.getParameter("responsibilities");
		String location = request.getParameter("location");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
				
		EmploymentHistory eh = new EmploymentHistory();
		
		eh.setCompanyName(companyName);
		eh.setBusinessType(businessType);
		eh.setDesignation(designation);
		eh.setDepartment(department);
		eh.setExpertise(expertise);
		eh.setResponsibilities(responsibilities);
		eh.setLocation(location);
		eh.setStartDate(startDate);
		eh.setEndDate(endDate);
		
		eh = employmentHistoryService.save(eh);
		
		if (eh != null) {
			model.put("success", true);
			model.put("message", "Save Successful");
			return new ModelAndView("index", model);
		}else {
			model.put("error", false);
			model.put("message", "Save failed");
			return new ModelAndView("pages/employmenthistory", model);
		}
		
	}
	@GetMapping("/show-employmenthistory")
	public ModelAndView showAll() {
		Map<String, Object> model = new HashMap<>();
		List<EmploymentHistory> entityList  = employmentHistoryService.getAll();
		model.put("employmenthistoryList", entityList);
		return new ModelAndView("pages/show-employmenthistory", model);
	}
	
	@GetMapping("/employmenthistory/edit/{id}")
	public ModelAndView edit(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		EmploymentHistory entity = employmentHistoryService.getById(id);
		model.put("employmenthistoryEntity", entity);
		return new ModelAndView("pages/employmenthistory-edit", model);
	}
	
	@PostMapping("/updateEmploymenthistory")
	public ModelAndView updateUser(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String companyName = request.getParameter("companyName");
		String businessType = request.getParameter("businessType");
		String designation = request.getParameter("designation");
		String department = request.getParameter("department");
		String expertise = request.getParameter("expertise");
		String responsibilities = request.getParameter("responsibilities");
		String location = request.getParameter("location");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
				
		EmploymentHistory eh = new EmploymentHistory();
		
		eh.setCompanyName(companyName);
		eh.setBusinessType(businessType);
		eh.setDesignation(designation);
		eh.setDepartment(department);
		eh.setExpertise(expertise);
		eh.setResponsibilities(responsibilities);
		eh.setLocation(location);
		eh.setStartDate(startDate);
		eh.setEndDate(endDate);

		eh = employmentHistoryService.update(eh);
		
		List<EmploymentHistory> entityList  = employmentHistoryService.getAll();
		
		model.put("employmenthistoryList", entityList);
		
		return new ModelAndView("pages/show-employmenthistory", model);
	}
	
	@GetMapping("/employmenthistory/delete/{id}")
	public ModelAndView delete(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		 boolean delete_employmenthistory = employmentHistoryService.delete(id);
		 
		 if (delete_employmenthistory) {
				model.put("success", true);
				model.put("message", "Delete Successful");
				List<EmploymentHistory> entityList  = employmentHistoryService.getAll();
				model.put("employmenthistoryList", entityList);
			return new ModelAndView("pages/show-employmenthistory", model);
			}else {
				model.put("error", false);
				model.put("message", "Delete failed");
				return new ModelAndView("pages/employmenthistory", model);
			}
		 
		
	}
}
