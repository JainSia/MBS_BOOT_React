
package com.sjw.cms.domain;

import java.util.List;

import com.sjw.cms.enumeration.Status;

/**
 * @author saloni.jain
 *
 */
public class TrainerDTO {

	private List<String> skills;
	private int experience;
	private Status trainer_status;
	
	public TrainerDTO(List<String> skills, int experience, Status trainer_status) {
		super();
		this.skills = skills;
		this.experience = experience;
		this.trainer_status = trainer_status;
	}
	/**
	 * @return the skills
	 */
	public List<String> getSkills() {
		return skills;
	}
	
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	/**
	 * @return the trainer_status
	 */
	public Status getTrainer_status() {
		return trainer_status;
	}
	/**
	 * @param trainer_status the trainer_status to set
	 */
	public void setTrainer_status(Status trainer_status) {
		this.trainer_status = trainer_status;
	}

	
}
