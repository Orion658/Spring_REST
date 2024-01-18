package com.app.customException;

public class DuplicateMovieExeception extends Exception {

	private static final long serialVersionUID = 1L;

	public DuplicateMovieExeception(String e) {
		super(e);
	}

}
