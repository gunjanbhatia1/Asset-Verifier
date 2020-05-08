package com.project.restfulwebservices.asset;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="assets")
public class AssetJpa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	 @Column(name = "rfidCode")
	private String rfidCode;
	 
	
	 @Column(name = "username")
	private String username;
	 
	
	 @Column(name = "name")
	private String name;
	 
	
	 @Column(name = "status")
	private boolean status;
	 
	
	 @Column(name = "arrivalDate")
	private Date arrivalDate;
		
	 @Column(name = "companyCode")
	private String companyCode;
	 
	
	 @Column(name = "category")
	private String category;

	 @Column(name = "assetType")
	private String assetType;
	
	 @Column(name = "description")
		private String description;
		 
		
		 @Column(name = "warrantyNumber")
		private String warrantyNumber;
		 
		
		 @Column(name = "quantity")
		private String quantity;
		
		 @Column(name = "costCenter")
			private String costCenter;
			
		 @Column(name = "capitalizationDate")
			private Date capitalizationDate;
			
		 @Column(name = "image")
			private String image;
			
		
	
		@Column(name = "location")
			private String location;
		 
		 @Column(name = "financialData")
			private String financialData;
		 
		 @Column(name = "acquisationValue")
			private String acquisationValue;
		 
		 @Column(name = "netValue")
			private String netValue;
		 
		 @Column(name = "verificationDate")
			private Date verificationDate;

		 @Column(name = "presentImage")
			private String presentImage;
		 
		 @Column(name = "presentLocation")
			private String presentLocation;

		 @Column(name = "presentValue")
			private String presentValue;

		 
		 @Column(name = "itemSold")
			private Boolean itemSold;

		 @Column(name = "itemTransferred")
			private Boolean itemTransferred ;
		 
		
		@Column(name = "comments")
			private String comments ;

		 @Column(name = "found")
			private Boolean found;

		 @Column(name = "notFound")
			private Boolean notFound;

		


		

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

		public String getCompanyCode() {
			return companyCode;
		}

		public void setCompanyCode(String companyCode) {
			this.companyCode = companyCode;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getAssetType() {
			return assetType;
		}

		public void setAssetType(String assetType) {
			this.assetType = assetType;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getWarrantyNumber() {
			return warrantyNumber;
		}

		public void setWarrantyNumber(String warrantyNumber) {
			this.warrantyNumber = warrantyNumber;
		}

		public String getQuantity() {
		return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public String getCostCenter() {
			return costCenter;
		}

		public void setCostCenter(String costCenter) {
			this.costCenter = costCenter;
		}

		public Date getCapitalizationDate() {
			return capitalizationDate;
		}

		public void setCapitalizationDate(Date capitalizationDate) {
			this.capitalizationDate = capitalizationDate;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getFinancialData() {
			return financialData;
		}

		public void setFinancialData(String financialData) {
			this.financialData = financialData;
		}

		public String getAcquisationValue() {
			return acquisationValue;
		}

		public void setAcquisationValue(String acquisationValue) {
			this.acquisationValue = acquisationValue;
		}

		public Date getVerificationDate() {
			return verificationDate;
		}

		public void setVerificationDate(Date verificationDate) {
			this.verificationDate = verificationDate;
		}

		public String getPresentImage() {
			return presentImage;
		}

		public void setPresentImage(String presentImage) {
			this.presentImage = presentImage;
		}

		public String getPresentLocation() {
			return presentLocation;
		}

		public void setPresentLocation(String presentLocation) {
			this.presentLocation = presentLocation;
		}

		public String getPresentValue() {
			return presentValue;
		}

		public void setPresentValue(String presentValue) {
			this.presentValue = presentValue;
		}

		public Boolean getItemSold() {
			return itemSold;
		}

		public void setItemSold(Boolean itemSold) {
			this.itemSold = itemSold;
		}

		public Boolean getItemTransferred() {
			return itemTransferred;
		}

		public void setItemTransferred(Boolean itemTransferred) {
			this.itemTransferred = itemTransferred;
		}
		 public String getNetValue() {
				return netValue;
			}

			public void setNetValue(String netValue) {
				this.netValue = netValue;
			}


		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}
		
			public Boolean getFound() {
			return found;
		}

		public void setFound(Boolean found) {
			this.found = found;
		}

		public Boolean getNotFound() {
			return notFound;
		}

		public void setNotFound(Boolean notFound) {
			this.notFound = notFound;
		}
public AssetJpa() {}
		

		public AssetJpa(long id, String rfidCode, String username, String name, boolean status, Date arrivalDate,
				String companyCode, String category, String assetType, String description, String warrantyNumber,
				String quantity, String costCenter, Date capitalizationDate, String image, String location,
				String financialData, String acquisationValue, String netValue, Date verificationDate,
				String presentImage, String presentLocation, String presentValue, Boolean itemSold,
				Boolean itemTransferred, String comments, Boolean found, Boolean notFound) {
			super();
			this.id = id;
			this.rfidCode = rfidCode;
			this.username = username;
			this.name = name;
			this.status = status;
			this.arrivalDate = arrivalDate;
			this.companyCode = companyCode;
			this.category = category;
			this.assetType = assetType;
			this.description = description;
			this.warrantyNumber = warrantyNumber;
			this.quantity = quantity;
			this.costCenter = costCenter;
			this.capitalizationDate = capitalizationDate;
			this.image = image;
			this.location = location;
		this.financialData = financialData;
			this.acquisationValue = acquisationValue;
			this.netValue = netValue;
		this.verificationDate = verificationDate;
			this.presentImage = presentImage;
			this.presentLocation = presentLocation;
			this.presentValue = presentValue;
			this.itemSold = itemSold;
			this.itemTransferred = itemTransferred;
			this.comments = comments;
			this.found = found;
			this.notFound = notFound;
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
		AssetJpa other = (AssetJpa) obj;
		if (id != other.id)
			return false;
		return true;
	}
	 

	
	

}
