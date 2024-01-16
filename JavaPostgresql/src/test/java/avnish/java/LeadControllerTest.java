package avnish.java;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import avnish.java.bean.ResponseData;
import avnish.java.controller.LeadController;
import avnish.java.model.Lead;
import avnish.java.service.LeadService;

@RunWith(MockitoJUnitRunner.class)
public class LeadControllerTest {
    @InjectMocks
    private LeadController leadController;

    @Mock
    private LeadService leadService;

    @Test
    public void testCreateLead() {
    	ResponseEntity<ResponseData> rs = new ResponseEntity<ResponseData>(null);	
    	Date date = new Date();
		Timestamp dateTime = new Timestamp(date.getTime());
        Lead lead = new Lead();
        lead.setFirstName("avnish");
        lead.setLastName("pandey");
        lead.setLeadId(18);
        lead.setGender("Male");
        lead.setMobileNumber(12345);
        lead.setEmail("avnish.pandey@test.com");

        when(leadService.saveData(lead)).thenReturn(rs);

        ResponseEntity<ResponseData> response = leadController.createEmployee(lead);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(lead, response.getBody());
    }
}