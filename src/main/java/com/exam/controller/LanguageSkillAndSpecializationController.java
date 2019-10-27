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
import com.exam.model.LanguageSkillAndSpecialization;
import com.exam.model.PersonalDetails;
import com.exam.model.Training;
import com.exam.service.AcademicQualificationsService;
import com.exam.service.EmploymentHistoryService;
import com.exam.service.LanguageSkillAndSpecializationService;
import com.exam.service.PersonalDetailsService;
import com.exam.service.TrainingService;


@Controller
public class LanguageSkillAndSpecializationController {
	@Autowired
	LanguageSkillAndSpecializationService languageSkillAndSpecializationService;
	
	@GetMapping(value = "/languageSkillandspecialization")
	public ModelAndView getLanguageSkillAndSpecializationPage() {
		System.out.println("Ok");
		return new ModelAndView("pages/languageSkillandspecialization");
	}
	
	
	@PostMapping("/languageSkillandspecializationRegistration")
	public ModelAndView trainingRegistration(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		
		String languageName = request.getParameter("languageName");
		String reading = request.getParameter("reading");
		String writing = request.getParameter("writing");
		String speaking = request.getParameter("speaking");
		String specializationName = request.getParameter("specializationName");
		String proficiency = request.getParameter("proficiency");
						
		LanguageSkillAndSpecialization ls = new LanguageSkillAndSpecialization();
		
		ls.setLanguageName(languageName);
		ls.setReading(reading);
		ls.setWriting(writing);
		ls.setSpeaking(speaking);
		ls.setSpecializationName(specializationName);
		ls.setProficiency(proficiency);
		
		ls = languageSkillAndSpecializationService.save(ls);
		
		if (ls != null) {
			model.put("success", true);
			model.put("message", "Save Successful");
			return new ModelAndView("index", model);
		}else {
			model.put("error", false);
			model.put("message", "Save failed");
			return new ModelAndView("pages/languageSkillandspecialization", model);
		}
		
	}
	@GetMapping("/show-languageSkillandspecialization")
	public ModelAndView showAll() {
		Map<String, Object> model = new HashMap<>();
		List<LanguageSkillAndSpecialization> entityList  = languageSkillAndSpecializationService.getAll();
		model.put("languageSkillandspecializationList", entityList);
		return new ModelAndView("pages/show-languageSkillandspecialization", model);
	}
	
	@GetMapping("/languageSkillandspecialization/edit/{id}")
	public ModelAndView edit(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		LanguageSkillAndSpecialization entity = languageSkillAndSpecializationService.getById(id);
		model.put("languageSkillandspecializationList", entity);
		return new ModelAndView("pages/languageSkillandspecialization-edit", model);
	}
	
	@PostMapping("/updatelanguageSkillandspecialization")
	public ModelAndView updateUser(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String languageName = request.getParameter("languageName");
		String reading = request.getParameter("reading");
		String writing = request.getParameter("writing");
		String speaking = request.getParameter("speaking");
		String specializationName = request.getParameter("specializationName");
		String proficiency = request.getParameter("proficiency");
						
		LanguageSkillAndSpecialization ls = new LanguageSkillAndSpecialization();
		
		ls.setLanguageName(languageName);
		ls.setReading(reading);
		ls.setWriting(writing);
		ls.setSpeaking(speaking);
		ls.setSpecializationName(specializationName);
		ls.setProficiency(proficiency);

		ls = languageSkillAndSpecializationService.update(ls);
		
		List<LanguageSkillAndSpecialization> entityList  = languageSkillAndSpecializationService.getAll();
		
		model.put("languageSkillandspecializationList", entityList);
		
		return new ModelAndView("pages/show-languageSkillandspecialization", model);
	}
	
	@GetMapping("/languageSkillandspecialization/delete/{id}")
	public ModelAndView delete(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		 boolean delete_languageSkillandspecialization = languageSkillAndSpecializationService.delete(id);
		 
		 if (delete_languageSkillandspecialization) {
				model.put("success", true);
				model.put("message", "Delete Successful");
				List<LanguageSkillAndSpecialization> entityList  = languageSkillAndSpecializationService.getAll();
				model.put("languageSkillandspecializationList", entityList);
			return new ModelAndView("pages/show-languageskillandspecialization", model);
			}else {
				model.put("error", false);
				model.put("message", "Delete failed");
				return new ModelAndView("pages/languageskillandspecialization", model);
			}
		 
		
	}
}
