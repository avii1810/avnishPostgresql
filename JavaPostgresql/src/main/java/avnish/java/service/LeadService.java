package avnish.java.service;


import java.awt.print.Printable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;

import avnish.java.bean.ErrorDto;
import avnish.java.bean.LeadBean;
import avnish.java.bean.ResponseData;
import avnish.java.bean.leadResponse;
import avnish.java.model.Lead;
import avnish.java.repository.LeadRepository;

@Configuration
public class LeadService {
	
	@Autowired
	private LeadRepository leadRepository;
	
	public ResponseEntity<ResponseData> saveData(Lead lBean) {
		ResponseData ob = new ResponseData(null,null,null);		
		try {

			int leadId = lBean.getLeadId();
			Optional<Lead> lead = leadRepository.findById(leadId);
			if (lead.isEmpty()) {
				leadRepository.save(lBean);
				return ResponseEntity.ok(new ResponseData(null, "Success", "Created Leads Successfully"));
			} else {
				String code = "E0010";
				String message = "Lead Already Exists in the database with the lead id";
				ErrorDto err = new ErrorDto(code, message);
				ob.setErrorResponse(err);
				ob.setStatus("Error");
				return ResponseEntity.ok(new ResponseData(err, "Error", null));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(ob);
			
	}

	public ResponseEntity<ResponseData> getLeadByMob(Integer mobileNO) {
		ResponseData ob = new ResponseData(null,null,null);
		List<Lead> obList = leadRepository.findByMobileNumber(mobileNO);
		if(obList.isEmpty()) {
			String code = "E0010";
			String message= "No Lead found with the Mobile Number";
			ErrorDto err = new ErrorDto(code, message);
			ob.setErrorResponse(err);
			ob.setStatus("Error");
			return ResponseEntity.ok(new ResponseData(err, "Error", null));
		}else {
		ob.setStatus("Success");
		ob.setData(obList);
		}
		return ResponseEntity.ok(ob);
		
	}
	


}