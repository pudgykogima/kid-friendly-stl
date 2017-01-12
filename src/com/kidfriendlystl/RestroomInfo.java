package com.kidfriendlystl;

public class RestroomInfo {
	
	private int businessID;
	private Boolean clean;
	private Boolean toddlerSeat;
	private Boolean handDryer;
	private boolean womensRoom;
	private boolean mensRoom;
	private boolean familyRoom;
	private boolean noChangingTable;
	
	public RestroomInfo(int businessID, Boolean clean, Boolean toddlerSeat, Boolean handDryer, boolean womensRoom,
			boolean mensRoom, boolean familyRoom, boolean noChangingTable) {
		this.businessID = businessID;
		this.clean = clean;
		this.toddlerSeat = toddlerSeat;
		this.handDryer = handDryer;
		this.womensRoom = womensRoom;
		this.mensRoom = mensRoom;
		this.familyRoom = familyRoom;
		this.noChangingTable = noChangingTable;
	}

	public RestroomInfo(Boolean clean, Boolean toddlerSeat, Boolean handDryer, boolean womensRoom, boolean mensRoom,
			boolean familyRoom, boolean noChangingTable) {
		this.clean = clean;
		this.toddlerSeat = toddlerSeat;
		this.handDryer = handDryer;
		this.womensRoom = womensRoom;
		this.mensRoom = mensRoom;
		this.familyRoom = familyRoom;
		this.noChangingTable = noChangingTable;
	}
	
	public RestroomInfo(int businessID, boolean clean, boolean toddlerSeat, boolean handDryer, boolean womensRoom,
			boolean mensRoom, boolean familyRoom, boolean noChangingTable) {
		this.businessID = businessID;
		this.clean = new Boolean(clean);
		this.toddlerSeat = new Boolean(toddlerSeat);
		this.handDryer = new Boolean(handDryer);
		this.womensRoom = womensRoom;
		this.mensRoom = mensRoom;
		this.familyRoom = familyRoom;
		this.noChangingTable = noChangingTable;
	}

	public RestroomInfo(boolean clean, boolean toddlerSeat, boolean handDryer, boolean womensRoom, boolean mensRoom,
			boolean familyRoom, boolean noChangingTable) {
		this.clean = new Boolean(clean);
		this.toddlerSeat = new Boolean(toddlerSeat);
		this.handDryer = new Boolean(handDryer);
		this.womensRoom = womensRoom;
		this.mensRoom = mensRoom;
		this.familyRoom = familyRoom;
		this.noChangingTable = noChangingTable;
	}

	public int getBusinessID() {
		return businessID;
	}

	public Boolean isClean() {
		return clean;
	}

	public Boolean isToddlerSeat() {
		return toddlerSeat;
	}

	public Boolean isHandDryer() {
		return handDryer;
	}

	public boolean isWomensRoom() {
		return womensRoom;
	}

	public boolean isMensRoom() {
		return mensRoom;
	}

	public boolean isFamilyRoom() {
		return familyRoom;
	}

	public boolean isNoChangingTable() {
		return noChangingTable;
	}

	public void setBusinessID(int businessID) {
		this.businessID = businessID;
	}

	public void setClean(Boolean clean) {
		this.clean = clean;
	}
	public void setClean(boolean clean) {
		this.clean = Boolean.valueOf(clean);
	}

	public void setToddlerSeat(Boolean toddlerSeat) {
		this.toddlerSeat = toddlerSeat;
	}
	public void setToddlerSeat(boolean toddlerSeat) {
		this.toddlerSeat = Boolean.valueOf(toddlerSeat);
	}

	public void setHandDryer(Boolean handDryer) {
		this.handDryer = handDryer;
	}
	public void setHandDryer(boolean handDryer) {
		this.handDryer = Boolean.valueOf(handDryer);
	}

	public void setWomensRoom(boolean womensRoom) {
		this.womensRoom = womensRoom;
	}

	public void setMensRoom(boolean mensRoom) {
		this.mensRoom = mensRoom;
	}

	public void setFamilyRoom(boolean familyRoom) {
		this.familyRoom = familyRoom;
	}

	public void setNoChangingTable(boolean noChangingTable) {
		this.noChangingTable = noChangingTable;
	}
	
	
}