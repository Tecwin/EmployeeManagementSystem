package com.project.EmployeeManagementApp.DTO;

public class CustomResponseDTO {

	private String status;
	private Integer statusCode;
	private String message;
	
	
	public CustomResponseDTO(String status, Integer statusCode, String message) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "CustomResponseDTO [status=" + status + ", statusCode=" + statusCode + ", message=" + message + "]";
	}
	
	
}
