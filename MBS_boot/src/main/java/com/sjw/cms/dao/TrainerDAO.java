package com.sjw.cms.dao;

import java.util.List;

import com.sjw.cms.domain.TraineeDTO;
import com.sjw.cms.domain.TrainerDTO;
import com.sjw.cms.exception.DAOException;

public interface TrainerDAO {

	public int addTrainee( TraineeDTO traineeDTO) throws DAOException;
	
	public boolean changeStatusOfTrainee(String traineeName) throws DAOException;
	
	public List<TraineeDTO> getListOfTrainee() throws DAOException;
	
	public void addTraineeToBatch(TraineeDTO traineeDTO) throws DAOException;
	
	public String createFolder() throws DAOException;
	
	public String deleteFolder() throws DAOException;
	
	public int updateProfile(int id,TrainerDTO trainerDTO) throws DAOException;
	
	public int addDocument(String filePath) throws DAOException;
	
	public boolean changeStatusOfBatch(String batchName) throws DAOException;
	
}
