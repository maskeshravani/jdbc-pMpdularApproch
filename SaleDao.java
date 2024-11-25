package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SaleDao {

	// CREATE TABLE
	public void CreateTable() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");

		PreparedStatement ps = c.prepareStatement("create table Sale(id int ,product varchar(10), amount int)");
		ps.execute();
		System.out.println("Table Created Succesfully....");
	}

	// INSERT DATA
	public void insertData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		PreparedStatement ps = c.prepareStatement("insert into sales (SalesId, product, Amount) values (?,?,?)");
		ps.setInt(1, 7);
		ps.setString(2, "A");
		ps.setInt(3, 170);

		ps.executeUpdate();
		System.out.println("Data Inserted Succesfully....");

	}

	// UPDATE DATA
	public void updateData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		PreparedStatement ps = c.prepareStatement("update sales set product = ? where SalesId = ?");
		ps.setString(1, "B");
		ps.setInt(2, 7);

		ps.executeUpdate();
		System.out.println("Data Updated Succesfully....");

	}

	// DELETE DATA
	public void deleteData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		PreparedStatement ps = c.prepareStatement("delete from Sales where SalesId = ?");
		ps.setInt(1, 7);

		ps.executeUpdate();
		System.out.println("Data Delete Succesfully....");
	}
	// FETCH DATA

	public void fetchData() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from Sales");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(
					"SalesId_Id: " + rs.getInt(1) + "  product:  " + rs.getString(2) + "  Amount:  " + rs.getInt(3));

		}
		c.close();

	}
}
