package com.musicShop.biz;

import com.musicShop.data.xml.EmployeeListing;
import com.musicShop.frontEnd.EmployeesWebService;

@javax.ejb.Stateless
@javax.interceptor.Interceptors(value = {com.musicShop.interceptors.UserControl.class})
public class EmployeesBean implements EmployeesWebService {
	private EmployeeListing employess;

	public EmployeeListing getList() {
		EmployeeListing e = new EmployeeListing();
		e.setList(com.musicShop.tools.FakeDAO.getAllEmplyees());
		return e;
	}
}