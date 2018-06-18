package com.sjw.cms.domain;

public class Course {

	private int id;
	private int name;
	private int technology;
	private String folderCoursepath;
	private String description;
	
	public Course() {
	}
	
	public Course(int id, int name, int technology, String folderCoursepath, String description) {
		super();
		this.id = id;
		this.name = name;
		this.technology = technology;
		this.folderCoursepath = folderCoursepath;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public int getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(int name) {
		this.name = name;
	}
	/**
	 * @return the technology
	 */
	public int getTechnology() {
		return technology;
	}
	/**
	 * @param technology the technology to set
	 */
	public void setTechnology(int technology) {
		this.technology = technology;
	}
	/**
	 * @return the folderCoursepath
	 */
	public String getFolderCoursepath() {
		return folderCoursepath;
	}
	/**
	 * @param folderCoursepath the folderCoursepath to set
	 */
	public void setFolderCoursepath(String folderCoursepath) {
		this.folderCoursepath = folderCoursepath;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
