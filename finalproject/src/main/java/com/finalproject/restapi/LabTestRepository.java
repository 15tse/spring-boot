package com.finalproject.restapi;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LabTestRepository extends JpaRepository<LabTest, Long> {
	
	 List<LabTestResult> findByTestId(Long testId);
	 List<LabTest> findByPatientId(Long patientId);


}
