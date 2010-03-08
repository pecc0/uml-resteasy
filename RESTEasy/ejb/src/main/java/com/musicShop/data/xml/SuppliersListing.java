package com.musicShop.data.xml;

import java.util.ArrayList;
import com.musicShop.data.xml.TableColumn;
import com.musicShop.data.entities.Supplier;
import java.util.List;

@javax.xml.bind.annotation.XmlRootElement(name = "json")
public class SuppliersListing {
	@javax.xml.bind.annotation.XmlElement
	public java.util.ArrayList<com.musicShop.data.xml.TableColumn> aoColumns = TableColumn.columnsFromClass(Supplier.class);;
	Supplier[] list;

	@javax.xml.bind.annotation.XmlElement(name = "aaData")
	public java.util.List<Supplier> getSuppliers() {
		return java.util.Arrays.asList(list);
	}

	public void setList(Supplier[] aList) {
		this.list = aList;
	}
}