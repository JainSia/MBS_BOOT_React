package com.sjw.cms.domain;

import java.sql.Date;

import com.sjw.cms.enumeration.Status;

public class TraineeDTO extends UserDTO{

	private Batch batch_id;
	private Date date_of_joining;
	private Status traineeStatus;
	
	
	public TraineeDTO(Batch batch_id, Date date_of_joining, Status traineeStatus) {
		super();
		this.batch_id = batch_id;
		this.date_of_joining = date_of_joining;
		this.traineeStatus = traineeStatus;
	}
	/**
	 * @return the batch_id
	 */
	public Batch getBatch_id() {
		return batch_id;
	}
	/**
	 * @param batch_id the batch_id to set
	 */
	public void setBatch_id(Batch batch_id) {
		this.batch_id = batch_id;
	}
	/**
	 * @return the date_of_joining
	 */
	public Date getDate_of_joining() {
		return date_of_joining;
	}
	/**
	 * @param date_of_joining the date_of_joining to set
	 */
	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	/**
	 * @return the traineeStatus
	 */
	public Status getTraineeStatus() {
		return traineeStatus;
	}
	/**
	 * @param traineeStatus the traineeStatus to set
	 */
	public void setTraineeStatus(Status traineeStatus) {
		this.traineeStatus = traineeStatus;
	}
	
	
}
