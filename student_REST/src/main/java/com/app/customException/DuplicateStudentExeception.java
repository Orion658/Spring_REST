package com.app.customException;

public class DuplicateStudentExeception extends Exception {

	private static final long serialVersionUID = 1L;

	public DuplicateStudentExeception(String e) {
		super(e);
	}

}
