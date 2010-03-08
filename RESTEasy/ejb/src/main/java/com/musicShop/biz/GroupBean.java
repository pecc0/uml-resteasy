package com.musicShop.biz;

import com.musicShop.forms.GroupForm;
import com.musicShop.frontEnd.GroupService;

@javax.ejb.Stateless
@javax.interceptor.Interceptors(value = {com.musicShop.interceptors.UserControl.class})
public class GroupBean implements GroupService {

	public void addGroup(GroupForm aGroup) {
		System.out.print("Sotore the login somewhere " + aGroup);
	}
}