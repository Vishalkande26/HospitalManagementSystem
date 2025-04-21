package com.hospital.management1;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.Patient;

	@RestController
	@RequestMapping("/patient1")
	public class PatientController
	{
		Patient patient;
	//	@CrossOrigin(origins = "http://localhost:3000") // cors will for react integration
		
		@GetMapping("{patientId}")
		public Patient getPatientDetainls(String patientId)
		{
			return patient;
			//new  Patient("v3","vender1","address1","898989898");		
			
		}
		
	//	@CrossOrigin(origins = "http://localhost:3000")
		
		@PostMapping
		public String createPatientDetails(@RequestBody Patient patient)
		{
			this.patient=patient;
			return "Patient Created Successfully!!";
		}
		//@CrossOrigin(origins = "http://localhost:3000")
		
		@PutMapping
		public String updatePatientDetails(@RequestBody Patient patient)
		{
			this.patient=patient;
			return "Patient Updated Successfully!!";
		}
		//@CrossOrigin(origins = "http://localhost:3000")
		
		@DeleteMapping("{patientId}")
		public String deletePatientDetails(String patientId)
		{
			this.patient=null;
			return "Patient Deleted Successfully!!";
		}
		
		
	}