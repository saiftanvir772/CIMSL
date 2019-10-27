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

import com.exam.model.Training;
import com.exam.service.TrainingService;


@Controller
public class TrainingController {
	@Autowired
	TrainingService trainingService;
	
	@GetMapping(value = "/training")
	public ModelAndView getTrainingPage() {
		System.out.println("Ok");
		return new ModelAndView("pages/training");
	}
	
	
	@PostMapping("/trainingRegistration")
	public ModelAndView trainingRegistration(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		
		String trainingTitle = request.getParameter("trainingTitle");
		String topic = request.getParameter("topic");
		String institute = request.getParameter("institute");
		String location = request.getParameter("location");
		String country = request.getParameter("country");
		String year = request.getParameter("year");
		String duration = request.getParameter("duration");
		String certificate = request.getParameter("certificate");
		
		Training training = new Training();
		
		
		training.setTrainingTitle(trainingTitle);
		training.setTopic(topic);
		training.setInstitute(institute);
		training.setLocation(location);
		training.setCountry(country);
		training.setYear(year);
		training.setDuration(duration);
		training.setCertificate(certificate);
		
		training = trainingService.save(training);
		
		if (training != null) {
			model.put("success", true);
			model.put("message", "Save Successful");
			return new ModelAndView("index", model);
		}else {
			model.put("error", false);
			model.put("message", "Save failed");
			return new ModelAndView("pages/training", model);
		}
		
	}
	@GetMapping("/show-training")
	public ModelAndView showAll() {
		Map<String, Object> model = new HashMap<>();
		List<Training> entityList  = trainingService.getAll();
		model.put("trainingList", entityList);
		return new ModelAndView("pages/show-training", model);
	}
	
	@GetMapping("/training/edit/{id}")
	public ModelAndView edit(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		Training entity = trainingService.getById(id);
		model.put("trainingEntity", entity);
		return new ModelAndView("pages/training-edit", model);
	}
	
	@PostMapping("/updateTraining")
	public ModelAndView updateUser(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String trainingTitle = request.getParameter("trainingTitle");
		String topic = request.getParameter("topic");
		String institute = request.getParameter("institute");
		
		String year = request.getParameter("year");
		String duration = request.getParameter("duration");
		String certificate = request.getParameter("certificate");
		
		Training training = new Training();

		training.setTrainingTitle(trainingTitle);
		training.setTopic(topic);
		training.setInstitute(institute);
		
		training.setYear(year);
		training.setDuration(duration);
		training.setCertificate(certificate);

		training = trainingService.update(training);
		
		List<Training> entityList  = trainingService.getAll();
		
		model.put("trainingList", entityList);
		
		return new ModelAndView("pages/show-training", model);
	}
	
	@GetMapping("/training/delete/{id}")
	public ModelAndView delete(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		 boolean delete_training = trainingService.delete(id);
		 
		 if (delete_training) {
				model.put("success", true);
				model.put("message", "Delete Successful");
				List<Training> entityList  = trainingService.getAll();
				model.put("trainingList", entityList);
			return new ModelAndView("pages/show-training", model);
			}else {
				model.put("error", false);
				model.put("message", "Delete failed");
				return new ModelAndView("pages/training", model);
			}
		 
		
	}
}
