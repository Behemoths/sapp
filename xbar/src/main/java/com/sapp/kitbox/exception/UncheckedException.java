package com.sapp.kitbox.exception;

/**
 * 未经检查的异常类
 * @author Behemoth
 *
 */
public class UncheckedException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String errorCode = null;
	private String errorMessage;
	
	public UncheckedException(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public UncheckedException(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public String getMessage() {
		return getErrorMessage() != null ? getErrorMessage() : "";
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
