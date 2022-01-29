package com.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Model.RegistrationPage;
import com.user.Repository.RegistrationDAO;

@Service
public class RegistrationServiceimpl implements RegistrationService {
	@Autowired
	RegistrationDAO dao;
	public RegistrationPage addRegistrationPage(RegistrationPage Reg)
	{
		RegistrationPage registration= dao.save(Reg);
		return Reg;
	}
	

}
