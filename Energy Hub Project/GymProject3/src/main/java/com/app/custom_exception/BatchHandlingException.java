package com.app.custom_exception;

@SuppressWarnings("serial")
public class BatchHandlingException extends RuntimeException {
public BatchHandlingException(String msg) {
	super(msg);
}
}
