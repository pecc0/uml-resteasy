package com.musicShop.frontEnd;

import com.musicShop.forms.GroupForm;

@javax.ws.rs.Path(value = "albums")
public interface GroupService {

	@javax.ws.rs.POST
	@javax.ws.rs.Path(value = "add")
	public void addGroup(GroupForm aGroup);
}