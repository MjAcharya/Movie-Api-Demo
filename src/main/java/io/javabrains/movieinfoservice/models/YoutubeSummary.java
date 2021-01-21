package io.javabrains.movieinfoservice.models;

import java.util.ArrayList;

public class YoutubeSummary {
	private String regionCode;
	private ArrayList<YoutubeItems> items;
	/**
	 * @return the regionCode
	 */
	public String getRegionCode() {
		return regionCode;
	}
	/**
	 * @param regionCode the regionCode to set
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	/**
	 * @return the items
	 */
	public ArrayList<YoutubeItems> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<YoutubeItems> items) {
		this.items = items;
	}

	

}
