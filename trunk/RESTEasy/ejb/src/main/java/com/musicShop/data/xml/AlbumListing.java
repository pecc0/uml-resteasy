package com.musicShop.data.xml;

import java.util.ArrayList;
import com.musicShop.data.xml.TableColumn;
import com.musicShop.data.entities.Album;
import java.util.List;

@javax.xml.bind.annotation.XmlRootElement(name = "json")
public class AlbumListing {
	public java.util.ArrayList<com.musicShop.data.xml.TableColumn> aoColumns = TableColumn.columnsFromClass(Album.class);;
	Album[] list;

	@javax.xml.bind.annotation.XmlElement(name = "aaData")
	public java.util.List<Album> getSuppliers() {
		return java.util.Arrays.asList(list);
	}

	public void setAoColumns(java.util.ArrayList<com.musicShop.data.xml.TableColumn> aAoColumns) {
		this.aoColumns = aAoColumns;
	}

	public void setList(Album[] aList) {
		this.list = aList;
	}
}