package com.app.custom_exception;

@SuppressWarnings("serial")
public class DuplicateEntryException extends RuntimeException {
public DuplicateEntryException(String msg) {
	super(msg);
}
}
