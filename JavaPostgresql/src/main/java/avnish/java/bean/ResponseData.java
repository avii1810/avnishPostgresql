package avnish.java.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResponseData {
	
	@JsonProperty
	private Object errorResponse;
	
	@JsonProperty
	private String status;
	
	@JsonProperty
	private Object data;

	/**
	 * @return the errorResponse
	 */
	public Object getErrorResponse() {
		return errorResponse;
	}

	/**
	 * @param errorResponse the errorResponse to set
	 */
	public void setErrorResponse(Object errorResponse) {
		this.errorResponse = errorResponse;
	}

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
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	public ResponseData(Object errorResponse, String status, Object data) {
		super();
		this.errorResponse = errorResponse;
		this.status = status;
		this.data = data;
	}

	

}