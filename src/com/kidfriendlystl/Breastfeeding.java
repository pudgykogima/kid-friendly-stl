package com.kidfriendlystl;

public class Breastfeeding {
	
	private int businessID;
	private boolean clean;
	private boolean comfortable;
	private boolean bottleWarmer;
	private boolean lactationRoom;
	private boolean quietArea;
	private boolean grossOpts;
	private boolean nonSpecificOpts;
	
	public Breastfeeding(int businessID, boolean clean, boolean comfortable, boolean bottleWarmer,
			boolean lactationRoom, boolean quietArea, boolean grossOpts, boolean nonSpecificOpts) {
		this.businessID = businessID;
		this.clean = clean;
		this.comfortable = comfortable;
		this.bottleWarmer = bottleWarmer;
		this.lactationRoom = lactationRoom;
		this.quietArea = quietArea;
		this.grossOpts = grossOpts;
		this.nonSpecificOpts = nonSpecificOpts;
	}

	public Breastfeeding(boolean clean, boolean comfortable, boolean bottleWarmer, boolean lactationRoom,
			boolean quietArea, boolean grossOpts, boolean nonSpecificOpts) {
		this.clean = clean;
		this.comfortable = comfortable;
		this.bottleWarmer = bottleWarmer;
		this.lactationRoom = lactationRoom;
		this.quietArea = quietArea;
		this.grossOpts = grossOpts;
		this.nonSpecificOpts = nonSpecificOpts;
	}

	public int getBusinessID() {
		return businessID;
	}

	public boolean isClean() {
		return clean;
	}

	public boolean isComfortable() {
		return comfortable;
	}

	public boolean isBottleWarmer() {
		return bottleWarmer;
	}

	public boolean isLactationRoom() {
		return lactationRoom;
	}

	public boolean isQuietArea() {
		return quietArea;
	}

	public boolean isGrossOpts() {
		return grossOpts;
	}

	public boolean isNonSpecificOpts() {
		return nonSpecificOpts;
	}

	public void setBusinessID(int businessID) {
		this.businessID = businessID;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public void setComfortable(boolean comfortable) {
		this.comfortable = comfortable;
	}

	public void setBottleWarmer(boolean bottleWarmer) {
		this.bottleWarmer = bottleWarmer;
	}

	public void setLactationRoom(boolean lactationRoom) {
		this.lactationRoom = lactationRoom;
	}

	public void setQuietArea(boolean quietArea) {
		this.quietArea = quietArea;
	}

	public void setGrossOpts(boolean grossOpts) {
		this.grossOpts = grossOpts;
	}

	public void setNonSpecificOpts(boolean nonSpecificOpts) {
		this.nonSpecificOpts = nonSpecificOpts;
	}

}