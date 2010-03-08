package com.musicShop.frontEnd;

import com.musicShop.forms.LoginForm;

@javax.ejb.Stateless
@javax.interceptor.Interceptors(value = {com.musicShop.interceptors.UserControl.class})
public class LoginBean implements LoginService {

	public void receiveForm(LoginForm aParameter) {
		System.out.print("Sotore the login somewhere " + aParameter);
	}
}