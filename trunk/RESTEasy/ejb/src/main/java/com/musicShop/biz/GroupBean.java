package com.musicShop.biz;

import com.musicShop.data.entities.Group;
import com.musicShop.frontEnd.GroupService;

@javax.ejb.Stateless
@javax.interceptor.Interceptors(value = {com.musicShop.interceptors.UserControl.class})
public class GroupBean implements GroupService {

	public void addGroup(Group aGroup) {
		System.out.print("Sotore the login somewhere " + aGroup);
	}
}