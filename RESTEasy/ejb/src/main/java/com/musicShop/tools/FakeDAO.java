package com.musicShop.tools;

import java.util.ArrayList;

import com.musicShop.data.entities.Employee;

public class FakeDAO {

	public static Employee[] getAllEmplyees() {
		ArrayList<Employee> result = new ArrayList<Employee>();
		Employee e = new Employee();
		e.setEGN(8606135566L);
		result.add(e);
		return result.toArray(new Employee[]{});
	}

}
