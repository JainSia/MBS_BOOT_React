package com.yash.damsapp.daoimpl;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.damsapp.dao.UserDAO;
import com.yash.damsapp.domain.User;
@Repository
public class UserDAOImpl implements UserDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

	public void insert(User user) {
		String sql="insert into users(firstname,lastname,contact,email,address,loginname,password) values(?,?,?,?,?,?,?);";
		Object[] params=new Object[] {
			user.getFirstname(),
			user.getLastname(),
			user.getContact(),
			user.getEmail(),
			user.getAddress(),
			user.getLoginname(),
			user.getPassword(),
		};

		jdbcTemplate.update(sql,params);
		
	}
	

	
	

}
