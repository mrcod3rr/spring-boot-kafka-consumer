package com.learning.kafka.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//
//@Data
@JsonInclude(value = Include.NON_NULL)
//@NoArgsConstructor
//@AllArgsConstructor
public class Email {
	private String subject;
	private String message;
	private String fromEmail;
	private String from;
	private String to;

	public Email() {
		super();
	}

	public Email(String subject, String message, String fromEmail, String from, String to) {
		super();
		this.subject = subject;
		this.message = message;
		this.fromEmail = fromEmail;
		this.from = from;
		this.to = to;
	}

//	@Payload private List<String> to;
//	@Payload private List<String> cc;
//	@Payload private List<String> bcc;
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Email [subject=" + subject + ", message=" + message + ", fromEmail=" + fromEmail + ", from=" + from
				+ ", to=" + to + "]";
	}
}