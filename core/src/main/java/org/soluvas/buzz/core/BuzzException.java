package org.soluvas.buzz.core;

/**
 * @author ceefour
 *
 */
public class BuzzException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public BuzzException() {
		super();
	}

	/**
	 * @param message
	 */
	public BuzzException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public BuzzException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public BuzzException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public BuzzException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BuzzException(Throwable cause, String format, Object... args) {
		super(String.format(format, args), cause);
	}

}
