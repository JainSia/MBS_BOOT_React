package com.yash.cmsapp.dto;

public class PersonDTO {

	
	private int 	person_id;
	private String 	person_name;
	private String 	email;
	private String 	contact;
	private String 	address;
	
	public PersonDTO() {	
	}

	public PersonDTO(int person_id, String person_name, String email, String contact, String address) {
		this.person_id = person_id;
		this.person_name = person_name;
		this.email = email;
		this.contact = contact;
		this.address = address;
	}


	/**
	 * @return the person_id
	 */
	public int getPerson_id() {
		return person_id;
	}

	/**
	 * @param person_id the person_id to set
	 */
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	/**
	 * @return the person_name
	 */
	public String getPerson_name() {
		return person_name;
	}

	/**
	 * @param person_name the person_name to set
	 */
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
