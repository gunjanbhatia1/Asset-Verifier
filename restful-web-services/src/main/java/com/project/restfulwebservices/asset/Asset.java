package com.project.restfulwebservices.asset;

import java.util.Date;
public class Asset {

	protected Asset() {
		
	}
	
	private long id;
	private String rfidCode;
	private String username;
	private String name;
	private boolean status;
	private Date arrivalDate;
	
	public Asset(long id, String rfidCode, String username, String name,  Date arrivalDate,boolean status) {
		super();
		this.id = id;
		this.rfidCode = rfidCode;
		this.username = username;
		this.name = name;
		this.status = status;
		this.arrivalDate=arrivalDate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getRfidCode() {
		return rfidCode;
	}
	public void setRfidCode(String rfidCode) {
		this.rfidCode = rfidCode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asset other = (Asset) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
