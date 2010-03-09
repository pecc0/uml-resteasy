package com.musicShop.biz;

import com.musicShop.data.xml.AlbumListing;
import com.musicShop.data.entities.Album;
import com.musicShop.frontEnd.StockService;

@javax.ejb.Stateless
@javax.interceptor.Interceptors(value = {com.musicShop.interceptors.UserControl.class})
public class StockBean implements StockService {
	private AlbumListing employess;

	public AlbumListing getList() {
		AlbumListing e = new AlbumListing();
		e.setList(com.musicShop.tools.FakeDAO.getAllAlbums());
		return e;
	}

	public void addStock(Album aAlbum) {
		System.out.print("Store the album " + aAlbum);
	}
}