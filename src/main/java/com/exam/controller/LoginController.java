package com.exam.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.UserInfo;
import com.exam.service.UserInfoService;

@RestController
public class LoginController {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UserInfoService userInfoService;

	@PostMapping("/register")
	public UserInfo register(@RequestBody @Valid UserInfo userInfo, BindingResult results) {

		if (!results.hasErrors()) {
			userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
			return userInfoService.save(userInfo);
		}
		return null;

	}
	
	@GetMapping("/login")
	public ModelAndView getLogin() {		
		return new ModelAndView("login");
	}

	@GetMapping("/login-success")
	public ModelAndView getLoginSuccessPage() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		List<GrantedAuthority> roles =  (List<GrantedAuthority>) authentication.getAuthorities();
		
		if(roles.get(0).getAuthority().equalsIgnoreCase("Admin")) {
			return new ModelAndView("index");
		}else if(roles.get(0).getAuthority().equalsIgnoreCase("JobSeeker")) {
			return new ModelAndView("indexJS");
		}
		
		return null;
	}

}
