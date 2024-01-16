package avnish.java.model;

import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity

@Table(name = "leads")
public class Lead {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer leadId;

	    @Column(nullable = false)
	    @NotNull
	    @Size(min = 1, max = 255)
	    @Pattern(regexp = "^[A-Za-z]+$", message = "First Name should strictly contain Alphabets, no spaces.")
	    private String firstName;

	    private String middleName;

	    @Column(nullable = false)
	    @NotNull
	    @Size(min = 1, max = 255)
	    @Pattern(regexp = "^[A-Za-z]+$", message = "Last Name should strictly contain Alphabets, no spaces.")
	    private String lastName;

	    @Column(nullable = false)
	    @NotNull
	    @Pattern(regexp = "^[1-9][0-9]*$", message = "mobileNumber should strictly contain integer, first digit should be greater than 5, no spaces and mandatory")
	    private Integer mobileNumber;

	    @Column(nullable = false)
	    @NotNull
	    @Size(min = 1, max = 255)
	    private String gender;

	    @Column(nullable = false)
	    @Temporal(TemporalType.DATE)
	    @NotNull
	    private Date dob;

	    @Column(nullable = false)
	    @NotNull
	    @Size(min = 1, max = 255)
	    
	    private String email;

	
		public Integer getLeadId() {
			return leadId;
		}

		/**
		 * @param leadId the leadId to set
		 */
		public void setLeadId(Integer leadId) {
			this.leadId = leadId;
		}

		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the middleName
		 */
		public String getMiddleName() {
			return middleName;
		}

		/**
		 * @param middleName the middleName to set
		 */
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the mobileNumber
		 */
		public Integer getMobileNumber() {
			return mobileNumber;
		}

		/**
		 * @param mobileNumber the mobileNumber to set
		 */
		public void setMobileNumber(Integer mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		/**
		 * @return the gender
		 */
		public String getGender() {
			return gender;
		}

		/**
		 * @param gender the gender to set
		 */
		public void setGender(String gender) {
			this.gender = gender;
		}

		/**
		 * @return the dob
		 */
		public Date getDob() {
			return dob;
		}

		/**
		 * @param localTime the dob to set
		 */
		public void setDob(Date localTime) {
			this.dob = localTime;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Employee [leadId=" + leadId + ", firstName=" + firstName + ", middleName=" + middleName
					+ ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", dob="
					+ dob + ", email=" + email + "]";
		}
	    
	    
}