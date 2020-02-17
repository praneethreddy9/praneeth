package com.capg.sprint1.dadims.service;

import java.sql.Date;

import com.capg.sprint1.dadims.dao.DisplayRawMaterialOrder;
import com.capg.sprint1.dadims.dao.RawMaterialOrder;
import com.capg.sprint1.dadims.dao.SupplierDAO;
import com.capg.sprint1.dadims.model.RawMaterialStock;

public interface RawMaterialService {


		String trackRawMaterialOrder(RawMaterialStock rawMaterialStock);
		boolean doesRawMaterialOrderIdExist(String id);
		boolean processDateCheck(RawMaterialStock rawMaterialStock);
		String updateProcessDateInStock(RawMaterialStock rawMaterialStock);
		boolean validateManufacturing_date(Date Manufacturing_date);
		boolean validateExpiryDate(Date Manufacturing_date,Date expiry_date);
		String updateRawMaterialStock(RawMaterialStock rawMaterialStock);
		boolean doesRawMaterialOrderIdExistInStock(String orderId); 
		String displayRawMaterialOrders(DisplayRawMaterialOrder displayRawMaterialOrderObject);//*
		boolean doesdisplayRawMaterialOrderIdExistInStock(String orderId);
		String updateStatusRawMaterialOrder(String id, String status);
		String placeRawMaterialOrder(RawMaterialOrder rawMaterialOrder);
		long fetchWarehouseIds();
		long fetchSupplierIds();
		String fetchRawMaterialNames();
	    String fetchSupplierDetails(SupplierDAO supplierDetails);

	
}
