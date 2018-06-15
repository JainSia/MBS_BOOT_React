package com.yash.cmsapp.dao;

import com.yash.damsapp.dto.TraineeDTO;
import com.yash.damsapp.dto.TrainerDTO;
import com.yash.damsapp.exception.DAOException;

public interface TrainerDAO {
 
	public void addTrainee(TraineeDTO trainerDTO) throws DAOException;
	
	public void editTrainee(TraineeDTO traineeDTO) throws DAOException;
}
