package com.greedy.cosmetic.model.dto;

public class CosmeticDTO {
	
	private int cosmeticCode;
	private String cosmeticName;
	private int cosmeticPrice;
	private int categoryCode;
	private String stockStatus;
	
	public CosmeticDTO(){}

	public CosmeticDTO(int cosmeticCode, String cosmeticName, int cosmeticPrice, int categoryCode, String stockStatus) {
		super();
		this.cosmeticCode = cosmeticCode;
		this.cosmeticName = cosmeticName;
		this.cosmeticPrice = cosmeticPrice;
		this.categoryCode = categoryCode;
		this.stockStatus = stockStatus;
	}

	public int getCosmeticCode() {
		return cosmeticCode;
	}

	public void setCosmeticCode(int cosmeticCode) {
		this.cosmeticCode = cosmeticCode;
	}

	public String getCosmeticName() {
		return cosmeticName;
	}

	public void setCosmeticName(String cosmeticName) {
		this.cosmeticName = cosmeticName;
	}

	public int getCosmeticPrice() {
		return cosmeticPrice;
	}

	public void setCosmeticPrice(int cosmeticPrice) {
		this.cosmeticPrice = cosmeticPrice;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [cosmeticCode=" + cosmeticCode + ", cosmeticName=" + cosmeticName + ", cosmeticPrice="
				+ cosmeticPrice + ", categoryCode=" + categoryCode + ", stockStatus=" + stockStatus + "]";
	};
	
}
