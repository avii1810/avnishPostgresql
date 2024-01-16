package avnish.java;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import avnish.java.bean.ResponseData;
import avnish.java.model.Lead;
import avnish.java.repository.LeadRepository;
import avnish.java.service.LeadService;

@RunWith(MockitoJUnitRunner.class)
public class LeadServiceTest {
	@InjectMocks
	private LeadService leadService;

	@Mock
	private LeadRepository leadRepository;

	@Test
	public void testCreateLead() {
		ResponseEntity<ResponseData> rs = new ResponseEntity<ResponseData>(null);
		Lead lead = new Lead();
		lead.setFirstName("avnish");
		lead.setLastName("pandey");
		lead.setLeadId(18);
		lead.setGender("Male");
		lead.setMobileNumber(12345);
		lead.setEmail("avnish.pandey@test.com");

		when(leadRepository.save(lead)).thenReturn(lead);

		ResponseEntity<ResponseData> createdLead = leadService.saveData(lead);

		assertEquals(lead, createdLead);
	}
}