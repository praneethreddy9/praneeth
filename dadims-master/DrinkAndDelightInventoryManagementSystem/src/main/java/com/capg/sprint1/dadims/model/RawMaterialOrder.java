package com.capg.sprint1.dadims.model;

import java.sql.Date;

public class RawMaterialOrder {

	String name;
	String orderId;
	String supplierId;
	double quantityValue;
	String quantityUnit;
	Date dateOfOrder;
	Date dateOfDelivary;
	double pricePerUnit;
	double totalPrice;
	String deliveryStatus;
	String warehouseId;
	
	public RawMaterialOrder() {
		super();
	}

	public RawMaterialOrder(String name, String orderId, String supplierId, double quantityValue,
			String quantityUnit, Date dateOfOrder, Date dateOfDelivary, double pricePerUnit, double totalPrice,
			String deliveryStatus, String warehouseId) {
		super();
		this.name = name;
		this.orderId = orderId;
		this.supplierId = supplierId;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.dateOfOrder = dateOfOrder;
		this.dateOfDelivary = dateOfDelivary;
		this.pricePerUnit = pricePerUnit;
		this.totalPrice = totalPrice;
		this.deliveryStatus = deliveryStatus;
		this.warehouseId = warehouseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public double getQuantityValue() {
		return quantityValue;
	}

	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public Date getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public Date getDateOfDelivary() {
		return dateOfDelivary;
	}

	public void setDateOfDelivary(Date dateOfDelivary) {
		this.dateOfDelivary = dateOfDelivary;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	@Override
	public String toString() {
		return "userAndProductDetails [name=" + name + ", orderId=" + orderId + ", supplierId=" + supplierId
				+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", dateOfOrder=" + dateOfOrder
				+ ", dateOfDelivary=" + dateOfDelivary + ", pricePerUnit=" + pricePerUnit + ", totalPrice=" + totalPrice
				+ ", deliveryStatus=" + deliveryStatus + ", warehouseId=" + warehouseId + "]";
	}
	
	
}
