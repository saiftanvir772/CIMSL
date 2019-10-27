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

import com.exam.model.Job;
import com.exam.model.Training;
import com.exam.service.JobService;

@Controller
public class JobController {
	@Autowired
	JobService jobService;
	
	@GetMapping(value = "/job")
	public ModelAndView getJobPage() {
		System.out.println("Ok");
		return new ModelAndView("pages/job");
	}
	
	@PostMapping("/jobRegistration")
	public ModelAndView trainingRegistration(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		
		String jobTitle = request.getParameter("jobTitle");
		String jobType = request.getParameter("jobType");
		String organizationType = request.getParameter("organizationType");
		String noOfVacancy = request.getParameter("noOfVacancy");
		String jobLocation = request.getParameter("jobLocation");
		String salary = request.getParameter("salary");
		String jobDescription = request.getParameter("jobDescription");
		String requirements = request.getParameter("requirements");
		String benefits = request.getParameter("benefits");
		String facilities = request.getParameter("facilities");
		String others = request.getParameter("others");
		String jobResponsibilities = request.getParameter("jobResponsibilities");
		String educationalRequirements = request.getParameter("educationalRequirements");
		String experienceRequirements = request.getParameter("experienceRequirements");
		String applicationDeadline = request.getParameter("applicationDeadline");
		
		Job job = new Job();
		
		job.setJobTitle(jobTitle);
		job.setJobType(jobType);
		job.setOrganizationType(organizationType);
		job.setNoOfVacancy(noOfVacancy);
		job.setJobLocation(jobLocation);
		job.setSalary(salary);
		job.setJobDescription(jobDescription);
		job.setRequirements(requirements);
		job.setBenefits(benefits);
		job.setFacilities(facilities);
		job.setOthers(others);
		job.setJobResponsibilities(jobResponsibilities);
		job.setEducationalRequirements(educationalRequirements);
		job.setExperienceRequirements(experienceRequirements);
		job.setApplicationDeadline(applicationDeadline);
		
		job = jobService.save(job);
		
		if (job != null) {
			model.put("success", true);
			model.put("message", "Save Successful");
			return new ModelAndView("index", model);
		}else {
			model.put("error", false);
			model.put("message", "Save failed");
			return new ModelAndView("pages/job", model);
		}
		
	}
	@GetMapping("/show-job")
	public ModelAndView showAll() {
		Map<String, Object> model = new HashMap<>();
		List<Job> entityList  = jobService.getAll();
		model.put("jobList", entityList);
		return new ModelAndView("pages/show-job", model);
	}
	
	@GetMapping("/job/edit/{id}")
	public ModelAndView edit(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		Job entity = jobService.getById(id);
		model.put("jobEntity", entity);
		return new ModelAndView("pages/job-edit", model);
	}
	
	@PostMapping("/updateJob")
	public ModelAndView updateUser(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String jobTitle = request.getParameter("jobTitle");
		String jobType = request.getParameter("jobType");
		String organizationType = request.getParameter("organizationType");
		String noOfVacancy = request.getParameter("noOfVacancy");
		String jobLocation = request.getParameter("jobLocation");
		String salary = request.getParameter("salary");
		String jobDescription = request.getParameter("jobDescription");
		String requirements = request.getParameter("requirements");
		String benefits = request.getParameter("benefits");
		String facilities = request.getParameter("facilities");
		String others = request.getParameter("others");
		String jobResponsibilities = request.getParameter("jobResponsibilities");
		String educationalRequirements = request.getParameter("educationalRequirements");
		String experienceRequirements = request.getParameter("experienceRequirements");
		String applicationDeadline = request.getParameter("applicationDeadline");
		
		Job job = new Job();
		
		job.setJobTitle(jobTitle);
		job.setJobType(jobType);
		job.setOrganizationType(organizationType);
		job.setNoOfVacancy(noOfVacancy);
		job.setJobLocation(jobLocation);
		job.setSalary(salary);
		job.setJobDescription(jobDescription);
		job.setRequirements(requirements);
		job.setBenefits(benefits);
		job.setFacilities(facilities);
		job.setOthers(others);
		job.setJobResponsibilities(jobResponsibilities);
		job.setEducationalRequirements(educationalRequirements);
		job.setExperienceRequirements(experienceRequirements);
		job.setApplicationDeadline(applicationDeadline);

		job = jobService.update(job);
		
		List<Job> entityList  = jobService.getAll();
		
		model.put("jobList", entityList);
		
		return new ModelAndView("pages/show-job", model);
	}
	
	@GetMapping("/job/delete/{id}")
	public ModelAndView delete(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		 boolean delete_job = jobService.delete(id);
		 
		 if (delete_job) {
				model.put("success", true);
				model.put("message", "Delete Successful");
				List<Job> entityList  = jobService.getAll();
				model.put("jobList", entityList);
			return new ModelAndView("pages/show-job", model);
			}else {
				model.put("error", false);
				model.put("message", "Delete failed");
				return new ModelAndView("pages/job", model);
			}
		 
		
	}
}
