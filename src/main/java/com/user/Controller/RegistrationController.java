package com.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Model.RegistrationPage;
import com.user.Service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	RegistrationService Service;
	@PostMapping("/Reg")
	public ResponseEntity<RegistrationPage> createProduct(@Validated @RequestBody RegistrationPage Reg)
	{
		System.out.println("Rest");
		RegistrationPage e= Service.addRegistrationPage(Reg);
		System.out.println(e);
		//return  ResponseEntity.ok().body("Registration Successfully");
		return new ResponseEntity<RegistrationPage>(e,HttpStatus.OK);
	}
		
		
	
	

	

}
