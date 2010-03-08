package com.musicShop.frontEnd;

import org.jboss.resteasy.annotations.Form;

import com.musicShop.forms.LoginForm;

@javax.ws.rs.Path(value = "access")
public interface LoginService {

	@javax.ws.rs.POST
	@javax.ws.rs.Path(value = "login")
	public void receiveForm(@Form LoginForm aForm);
}