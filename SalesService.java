package com.service;

import java.sql.SQLException;

import com.dao.SaleDao;

public class SalesService {

	// CREATE TABLE
	public void createTable() throws ClassNotFoundException, SQLException {
		SaleDao sd = new SaleDao();
		System.out.println("Service run Succesfully....");
		sd.CreateTable();
	}

	// INSERT DATA
	public void insertData() throws ClassNotFoundException, SQLException {
		SaleDao sd = new SaleDao();
		System.out.println("Service run Succesfully....");
		sd.insertData();
	}

	// UPDATE DATA
	public void updateData() throws ClassNotFoundException, SQLException {
		SaleDao sd = new SaleDao();
		System.out.println("Service run Succesfully....");
		sd.updateData();
	}

	// DELETE DATA
	public void deleteData() throws ClassNotFoundException, SQLException {
		SaleDao sd = new SaleDao();
		System.out.println("Service run Succesfully....");
		sd.deleteData();
	}

	// FETCH DATA
	public void fetchData() throws ClassNotFoundException, SQLException {
		SaleDao sd = new SaleDao();
		System.out.println("Service run Succesfully....");
		sd.fetchData();
	}
}
