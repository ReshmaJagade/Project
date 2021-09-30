package com.app.custom_exception;

@SuppressWarnings("serial")
public class BranchHandlingException extends RuntimeException {
public BranchHandlingException(String msg) {
	super(msg);
}
}
