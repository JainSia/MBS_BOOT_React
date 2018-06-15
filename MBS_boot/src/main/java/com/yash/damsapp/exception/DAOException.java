/**
 * 
 */
package com.yash.damsapp.exception;

/**
 * @author saloni.jain
 *
 */
@SuppressWarnings("serial")
public class DAOException extends Exception {

	public DAOException(String errorMessage) {
		super(errorMessage);
	}
}
