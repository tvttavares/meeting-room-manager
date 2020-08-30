package com.dio.meetingroommanagerapi.exception;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Data
public class ErrorDetails {

	private Date timestamp;
	private String message;
	private String details;

	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
}
