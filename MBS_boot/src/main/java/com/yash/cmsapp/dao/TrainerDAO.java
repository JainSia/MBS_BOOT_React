package com.yash.cmsapp.dao;

import com.yash.cmsapp.dto.TraineeDTO;
import com.yash.cmsapp.dto.TrainerDTO;
import com.yash.cmsapp.exception.DAOException;

public interface TrainerDAO {
 
	public void addTrainee(TraineeDTO trainerDTO) throws DAOException;
	
	public void editTrainee(TraineeDTO traineeDTO) throws DAOException;
}
