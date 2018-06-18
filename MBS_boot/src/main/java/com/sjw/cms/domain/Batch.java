/**
 * 
 */
package com.sjw.cms.domain;

import java.util.List;

import com.sjw.cms.enumeration.Status;

/**
 * @author saloni.jain
 *
 */
public class Batch {

	private int id;
	private String batch_name;
	private Status batch_status;
	private List<TraineeDTO> trainees;
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
	 * @return the batch_name
	 */
	public String getBatch_name() {
		return batch_name;
	}
	/**
	 * @param batch_name the batch_name to set
	 */
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	/**
	 * @return the trainees
	 */
	public List<TraineeDTO> getTrainees() {
		return trainees;
	}
	/**
	 * @param trainees the trainees to set
	 */
	public void setTrainees(List<TraineeDTO> trainees) {
		this.trainees = trainees;
	}
	/**
	 * @return the batch_status
	 */
	public Status getBatch_status() {
		return batch_status;
	}
	/**
	 * @param batch_status the batch_status to set
	 */
	public void setBatch_status(Status batch_status) {
		this.batch_status = batch_status;
	}
	
	
}
