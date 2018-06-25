package com.sjw.cms.daoimpl;

import java.util.List;

import com.sjw.cms.dao.AdminDAO;
import com.sjw.cms.domain.TraineeDTO;
import com.sjw.cms.domain.TrainerDTO;
import com.sjw.cms.exception.DAOException;

public class AdminDAOImpl implements AdminDAO{

	
	@Override
	public int addTrainer(TrainerDTO trainerDTO) throws DAOException {
		
		return 0;
	}

	@Override
	public int deleteTrainer(String trainerName) throws DAOException {
		
		
		return 0;
	}

	@Override
	public List<TraineeDTO> getListOfTrainee() throws DAOException {
		return null;
	}

	@Override
	public List<TrainerDTO> getListOfTrainer() throws DAOException {
		return null;
	}

	@Override
	public boolean changeStatusOfTrainer() throws DAOException {
		return false;
	}

}
