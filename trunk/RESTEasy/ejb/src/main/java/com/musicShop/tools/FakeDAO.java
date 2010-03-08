package com.musicShop.tools;

import java.util.ArrayList;

import com.musicShop.data.entities.Album;
import com.musicShop.data.entities.Employee;
import com.musicShop.data.entities.Supplier;

public class FakeDAO {

	public static Employee[] getAllEmplyees() {
		ArrayList<Employee> result = new ArrayList<Employee>();
		Employee e = new Employee();
		e.setFirstName("petko");
		e.setEGN(8606135566L);
		result.add(e);
		e = new Employee();
		e.setEGN(8606135561L);
		e.setFirstName("mitko");
		result.add(e);
		return result.toArray(new Employee[]{});
	}

	public static Supplier[] getAllSuppliers() {
		ArrayList<Supplier> result = new ArrayList<Supplier>();
		Supplier e = new Supplier();
		e.setFirmName("sup 1");
		e.setOwnerName("owner");
		result.add(e);
		e = new Supplier();
		e.setFirmName("sup 2");
		e.setOwnerName("2's owner");
		result.add(e);
		return result.toArray(new Supplier[]{});
	}

	public static Album[] getAllAlbums() {
		ArrayList<Album> result = new ArrayList<Album>();
		Album e = new Album();
		e.setStyle("hard rock");
		//e.setOwnerName("owner");
		result.add(e);
		e = new Album();
		//e.setFirmName("sup 2");
		//e.setOwnerName("2's owner");
		result.add(e);
		return result.toArray(new Album[]{});
	}
}
