package com.springmvcone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {

	@Autowired
	private LoginDAO login;

	public boolean check(String uname, String pass) {
		try {
			return pass.equals(login.verifyPass(uname));
		} catch (Exception e) {
			return false;
		}

	}
}
