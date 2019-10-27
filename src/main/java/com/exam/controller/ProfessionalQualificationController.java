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
import com.exam.model.ProfessionalQualification;
import com.exam.model.Training;
import com.exam.service.AcademicQualificationsService;
import com.exam.service.PersonalDetailsService;
import com.exam.service.ProfessionalQualificationService;
import com.exam.service.TrainingService;


@Controller
public class ProfessionalQualificationController {
	@Autowired
	ProfessionalQualificationService professionalQualificationService;
	
	@GetMapping(value = "/professionalqualification")
	public ModelAndView getTrainingPage() {
		System.out.println("Ok");
		return new ModelAndView("pages/professionalqualification");
	}
	
	
	@PostMapping("/professionalqualificationRegistration")
	public ModelAndView trainingRegistration(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		
		String certificateTitle = request.getParameter("certificateTitle");
		String institute = request.getParameter("institute");
		String location = request.getParameter("location");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		
		ProfessionalQualification pq = new ProfessionalQualification();
		
		pq.setCertificateTitle(certificateTitle);
		pq.setInstitute(institute);
		pq.setLocation(location);
		pq.setStartDate(startDate);
		pq.setEndDate(endDate);
		
		pq = professionalQualificationService.save(pq);
		
		if (pq != null) {
			model.put("success", true);
			model.put("message", "Save Successful");
			return new ModelAndView("index", model);
		}else {
			model.put("error", false);
			model.put("message", "Save failed");
			return new ModelAndView("pages/professionalqualification", model);
		}
		
	}
	@GetMapping("/show-professionalqualification")
	public ModelAndView showAll() {
		Map<String, Object> model = new HashMap<>();
		List<ProfessionalQualification> entityList  = professionalQualificationService.getAll();
		model.put("professionalqualificationList", entityList);
		return new ModelAndView("pages/show-professionalqualification", model);
	}
	
	@GetMapping("/professionalqualification/edit/{id}")
	public ModelAndView edit(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		ProfessionalQualification entity = professionalQualificationService.getById(id);
		model.put("professionalqualificationEntity", entity);
		return new ModelAndView("pages/professionalqualification-edit", model);
	}
	
	@PostMapping("/updateprofessionalqualification")
	public ModelAndView updateUser(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String certificateTitle = request.getParameter("certificateTitle");
		String institute = request.getParameter("institute");
		String location = request.getParameter("location");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		
		ProfessionalQualification pq = new ProfessionalQualification();
		
		pq.setCertificateTitle(certificateTitle);
		pq.setInstitute(institute);
		pq.setLocation(location);
		pq.setStartDate(startDate);
		pq.setEndDate(endDate);

		pq = professionalQualificationService.update(pq);
		
		List<ProfessionalQualification> entityList  = professionalQualificationService.getAll();
		
		model.put("professionalqualificationList", entityList);
		
		return new ModelAndView("pages/show-professionalqualification", model);
	}
	
	@GetMapping("/professionalqualification/delete/{id}")
	public ModelAndView delete(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		 boolean delete_professionalqualification = professionalQualificationService.delete(id);
		 
		 if (delete_professionalqualification) {
				model.put("success", true);
				model.put("message", "Delete Successful");
				List<ProfessionalQualification> entityList  = professionalQualificationService.getAll();
				model.put("professionalqualificationList", entityList);
			return new ModelAndView("pages/show-professionalqualification", model);
			}else {
				model.put("error", false);
				model.put("message", "Delete failed");
				return new ModelAndView("pages/professionalqualification", model);
			}
		 
		
	}
}
