package com.capg.sprint1.dadims.dao;

import java.sql.Date;

import com.capg.sprint1.dadims.model.ProductStock;


public interface ProductDAO {

	String trackProductOrder(ProductStock productStock);
	boolean doesProductOrderIdExist(String id);
	boolean exitDateCheck(ProductStock productStock);
	String updateExitDateInStock(ProductStock productStock);
	boolean validateManufacturingDate(Date Manufacturing_date);
	boolean validateExpiryDate(Date Manufacturing_date,Date expiry_date);
	String updateProductStock(ProductStock productStock);
	boolean doesProductOrderIdExistInStock(String orderId);
	
}
