package com.musicShop.frontEnd;

import com.musicShop.data.xml.SuppliersListing;

@javax.ejb.Stateless
@javax.interceptor.Interceptors(value = {com.musicShop.interceptors.UserControl.class})
public class SupplierssBean implements SuppliersWebService {
	private SuppliersListing employess;

	public SuppliersListing getList() {
		SuppliersListing e = new SuppliersListing();
		e.setList(com.musicShop.tools.FakeDAO.getAllSuppliers());
		return e;
	}
}