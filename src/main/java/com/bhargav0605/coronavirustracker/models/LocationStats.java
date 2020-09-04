package com.bhargav0605.coronavirustracker.models;

public class LocationStats {
	
	private String stat;
	private String country;
	private int latestTotalCases;
	private int diffFromPreviousDay;
	
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	public int getDiffFromPreviousDay() {
		return diffFromPreviousDay;
	}
	public void setDiffFromPreviousDay(int diffFromPreviousDay) {
		this.diffFromPreviousDay = diffFromPreviousDay;
	}
	@Override
	public String toString() {
		return "LocationStats [stat='" + stat + '\'' +
				", country='" + country + '\'' +
				", latestTotalCases=" + latestTotalCases + "]";
	}
	
	
	
}
