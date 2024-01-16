package avnish.java.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class leadResponse {
	
	@JsonProperty
	private String status;
	
	@JsonProperty
	private String data;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	public leadResponse(String status, String data) {
		super();
		this.status = status;
		this.data = data;
	}

	
	
	
}