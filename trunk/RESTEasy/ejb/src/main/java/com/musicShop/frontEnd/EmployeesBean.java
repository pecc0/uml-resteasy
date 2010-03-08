package com.musicShop.frontEnd;

import com.musicShop.data.xml.EmployeeListing;

@javax.ejb.Stateless
public class EmployeesBean implements EmployeesWebService {
	private EmployeeListing employess;

	public EmployeeListing getList() {
		EmployeeListing e = new EmployeeListing();
				e.setList(com.musicShop.tools.FakeDAO.getAllEmplyees());
				return e;
	}
}