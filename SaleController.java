package com.controller;

import java.sql.SQLException;

import com.service.SalesService;

public class SaleController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SalesService ss = new SalesService();
		System.out.println("Controller run Succesfully....");
		ss.createTable();
		// ss.insertData();
		// ss.updateData();
		// ss.deleteData();
		// ss.fetchData();
	}

}
