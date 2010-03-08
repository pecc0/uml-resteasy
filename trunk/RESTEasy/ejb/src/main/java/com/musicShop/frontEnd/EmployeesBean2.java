package com.musicShop.frontEnd;

import com.musicShop.data.xml.EmployeeListing;

@javax.ejb.Stateless
@javax.interceptor.Interceptors(value = {com.musicShop.interceptors.UserControl.class})
public class EmployeesBean2 {

	public EmployeeListing getList() {
		EmployeeListing e = new EmployeeListing();
		e.setList(com.musicShop.tools.FakeDAO.getAllEmplyees());
		return e;
	}
}