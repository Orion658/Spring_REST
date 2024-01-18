package com.app.customException;

public class DuplicateUserExeception extends Exception {

	private static final long serialVersionUID = 1L;

	public DuplicateUserExeception(String e) {
		super(e);
	}

}
