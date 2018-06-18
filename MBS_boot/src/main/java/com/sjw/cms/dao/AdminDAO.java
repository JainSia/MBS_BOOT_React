/**
 * 
 */
package com.sjw.cms.dao;

import java.util.List;

import com.sjw.cms.domain.TraineeDTO;
import com.sjw.cms.domain.TrainerDTO;
import com.sjw.cms.exception.DAOException;

/**
 * @author saloni.jain
 *
 */
public interface AdminDAO {
	
	public int addTrainer(TrainerDTO trainerDTO) throws DAOException;
	
	public int deleteTrainer(String trainerName) throws DAOException;
	
	public List<TraineeDTO> getListOfTrainee() throws DAOException;
	
	public List<TrainerDTO> getListOfTrainer() throws DAOException;
	
	public boolean changeStatusOfTrainer() throws DAOException;
	
}
