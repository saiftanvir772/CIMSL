package com.exam.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.UserInfo;
import com.exam.service.UserInfoService;

@Controller
public class RegistrationController {
	@Autowired
	UserInfoService userInfoService;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@PostMapping("/userRegistration")
	public ModelAndView userRegistration(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String role = request.getParameter("role");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserInfo userInfo = new UserInfo();

		userInfo.setFirstName(fName);
		userInfo.setLastName(lName);
		userInfo.setRole(role);
		userInfo.setEmail(email);
		userInfo.setUsername(username);
		userInfo.setPassword(passwordEncoder.encode(password));
		
		userInfo.setCreatedDate(new Date());
		userInfo = userInfoService.save(userInfo);

		if (userInfo != null) {
			model.put("success", true);
			model.put("message", "Save Successful");
			return new ModelAndView("pages/register", model);
		}else {
			model.put("error", false);
			model.put("message", "Save failed");
			return new ModelAndView("pages/register", model);
		}
	}
	@GetMapping("/show-user")
	public ModelAndView showAll() {
		Map<String, Object> model = new HashMap<>();
		List<UserInfo> entityList  = userInfoService.getAll();
		model.put("userList", entityList);
		return new ModelAndView("pages/show-user", model);
	}
	
	@GetMapping("/user/edit/{id}")
	public ModelAndView edit(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		UserInfo entity = userInfoService.getById(id);
		model.put("userEntity", entity);
		return new ModelAndView("pages/user-edit", model);
	}
	
	@PostMapping("/updateUser")
	public ModelAndView updateUser(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		

		UserInfo userInfo = new UserInfo();
		
		userInfo.setFirstName(firstName);
		userInfo.setLastName(lastName);
		
		userInfo.setEmail(email);
		userInfo.setUsername(username);
		

		
		List<UserInfo> entityList  = userInfoService.getAll();
		model.put("userList", entityList);
		return new ModelAndView("pages/show-user", model);
	}
	
	@GetMapping("/user/delete/{id}")
	public ModelAndView delete(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		 boolean delete_user = userInfoService.delete(id);
		 
		 if (delete_user) {
				model.put("success", true);
				model.put("message", "Delete Successful");
				List<UserInfo> entityList  = userInfoService.getAll();
				model.put("userList", entityList);
			return new ModelAndView("pages/show-user", model);
			}else {
				model.put("error", false);
				model.put("message", "Delete failed");
				return new ModelAndView("pages/register", model);
			}
		 
		
	}
	
	
}
