package com.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Model.RegistrationPage;

public interface RegistrationDAO extends JpaRepository<RegistrationPage, Integer> {

}
