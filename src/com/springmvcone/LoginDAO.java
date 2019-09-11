package com.springmvcone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("loginDao")
public class LoginDAO {
	@Autowired
	private JdbcTemplate jt;

	public String verifyPass(String uname) throws DataAccessException{
		String query = "select pass from contact where name = ?";
		Object[] param = { uname };
		return jt.queryForObject(query, param, String.class);
	}
}
