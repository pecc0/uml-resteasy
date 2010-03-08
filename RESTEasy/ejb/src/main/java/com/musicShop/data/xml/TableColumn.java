package com.musicShop.data.xml;

import java.util.ArrayList;

@javax.xml.bind.annotation.XmlType
public class TableColumn {
	@javax.xml.bind.annotation.XmlElement
	public String sTitle = "";
	@javax.xml.bind.annotation.XmlElement
	public String sClass = "";
	AlbumListing unnamed_AlbumListing_;

	public static ArrayList columnsFromClass(java.lang.Class aClazz) {
				ArrayList<TableColumn> result = new ArrayList<TableColumn>();
				for (java.lang.reflect.Field f : aClazz.getDeclaredFields()) {
					TableColumn tc = new TableColumn();
					tc.sTitle = f.getName();
		
					result.add(tc);
				}
				return result;
	}
}