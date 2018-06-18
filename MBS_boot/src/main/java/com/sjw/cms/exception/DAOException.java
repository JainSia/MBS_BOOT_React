/**
 * 
 */
package com.sjw.cms.exception;

/**
 * @author saloni.jain
 *
 */
@SuppressWarnings("serial")
public class DAOException extends Exception {

	public DAOException(String errMsg) {
		super(errMsg);
	}
}
