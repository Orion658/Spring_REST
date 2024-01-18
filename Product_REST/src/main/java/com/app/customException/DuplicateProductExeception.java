package com.app.customException;

public class DuplicateProductExeception extends Exception {

	private static final long serialVersionUID = 1L;

	public DuplicateProductExeception(String e) {
		super(e);
	}

}
