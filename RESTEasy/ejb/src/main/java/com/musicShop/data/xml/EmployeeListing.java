package com.musicShop.data.xml;

import java.util.ArrayList;
import com.musicShop.data.xml.TableColumn;
import com.musicShop.data.entities.Employee;
import java.util.List;

@javax.xml.bind.annotation.XmlRootElement(name = "json")
public class EmployeeListing {
	@javax.xml.bind.annotation.XmlElement
	public java.util.ArrayList<com.musicShop.data.xml.TableColumn> aoColumns = TableColumn.columnsFromClass(Employee.class);;
	Employee[] list;

	@javax.xml.bind.annotation.XmlElement(name = "aaData")
	public java.util.List<Employee> getEmplyees() {
		return java.util.Arrays.asList(list);
	}

	public void setList(Employee[] aList) {
		this.list = aList;
	}
}