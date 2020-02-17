package com.capg.sprint1.dadims.service;

import com.capg.sprint1.dadims.model.ProductStock;

public interface ProductService {
	
	String trackProductOrder(ProductStock productStock);
	boolean doesProductOrderIdExist(String id);
	boolean exitDateCheck(ProductStock productStock);//*
	String updateExitDateInStock(ProductStock productStock);
	String updateProductStock(ProductStock productStock);
	boolean doesProductOrderIdExistInStock(String orderId); 
	

}
