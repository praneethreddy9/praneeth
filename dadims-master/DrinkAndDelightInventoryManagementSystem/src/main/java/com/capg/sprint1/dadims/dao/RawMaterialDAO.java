package com.capg.sprint1.dadims.dao;

import com.capg.sprint1.dadims.model.RawMaterialStock;

public interface RawMaterialDAO {

	String trackRawMaterialOrder(RawMaterialStock rawMaterialStock);
	boolean doesRawMaterialOrderIdExist(String id);
	boolean processDateCheck(RawMaterialStock rawMaterialStock);
	String updateProcessDateInStock(RawMaterialStock rawMaterialStock);
	String updateRawMaterialStock(RawMaterialStock rawMaterialStock);
	boolean doesRawMaterialOrderIdExistInStock(String orderId); 
	
}
