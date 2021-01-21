package io.javabrains.movieinfoservice.models;

public class ErroDisplay {
	public ErroDisplay(String message) {
		super();
		this.message = message;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
