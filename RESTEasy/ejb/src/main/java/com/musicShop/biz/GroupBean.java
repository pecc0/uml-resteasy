package com.musicShop.biz;

import com.musicShop.forms.GroupForm;
import com.musicShop.frontEnd.GroupService;

@javax.ejb.Stateless
@javax.interceptor.Interceptors(value = {com.musicShop.interceptors.UserControl.class})
public class GroupBean implements GroupService {

	@javax.ws.rs.POST
	@javax.ws.rs.Path(value = "add")
	public void addGroup(GroupForm aGroup) {
		throw new UnsupportedOperationException();
	}
}