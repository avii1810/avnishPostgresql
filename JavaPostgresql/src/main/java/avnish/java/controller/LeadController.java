package avnish.java.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import avnish.java.bean.LeadBean;
import avnish.java.bean.ResponseData;
import avnish.java.bean.leadResponse;
import avnish.java.exception.ResourceNotFoundException;
import avnish.java.model.Lead;
import avnish.java.repository.LeadRepository;
import avnish.java.service.LeadService;

@RestController
@Component
@RequestMapping("/api")
public class LeadController {
	@Autowired
	private LeadRepository leadRepository;
	
	@Autowired
	private LeadService leadService;



	@PostMapping("/leadsCreate")
	public ResponseEntity<ResponseData> createEmployee(@Valid @RequestBody Lead lead) {
		return leadService.saveData(lead);
	}

	@PostMapping("/leads/{mobNo}")
	public ResponseEntity<ResponseData> updateEmployee(@PathVariable(value = "mobNo") Integer mobileNO) throws ResourceNotFoundException {
		return leadService.getLeadByMob(mobileNO);
		
	}
}