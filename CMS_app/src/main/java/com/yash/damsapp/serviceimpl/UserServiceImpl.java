package com.yash.damsapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.damsapp.dao.UserDAO;
import com.yash.damsapp.domain.User;
import com.yash.damsapp.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	public void register(User user) {
		userDAO.insert(user);
	}
		

}
