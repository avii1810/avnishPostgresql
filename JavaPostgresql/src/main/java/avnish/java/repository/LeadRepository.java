package avnish.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import avnish.java.bean.LeadBean;
import avnish.java.model.Lead;

@Repository
@EnableJpaRepositories
public interface LeadRepository extends JpaRepository<Lead, Integer>{
	
	List<Lead> findByMobileNumber(Integer mobileNo);
	
	boolean existsByLeadId(Integer leadId);

    boolean existsByEmail(String email);
    
   
}