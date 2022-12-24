package com.acorn.mobileappws.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter @Setter
public class ErrorMessage {
	private Date timestamp;
	private String message;
	
	public ErrorMessage() {}
	
	public ErrorMessage(Date timestamp, String message)
	{
		this.timestamp = timestamp;
		this.message = message;
	}

}
