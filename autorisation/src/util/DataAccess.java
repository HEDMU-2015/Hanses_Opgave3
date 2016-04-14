package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataAccess {
	
	private Connection conn;
	
	public DataAccess() {
		this.conn = ConnectionHandler.instance().getConnection();
//		try {
//			this.conn =	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydatabase", "SA", "");
//			this.conn.setAutoCommit(false);
//		} catch (SQLException e) {
//			throw new RuntimeException("Connection could not be established", e);
//		}
	}
	
	public void commit() {
		ConnectionHandler.instance().commit();
//		try {
//			this.conn.commit();
//		} catch (SQLException e) {
//			throw new RuntimeException("Exception caught", e);
//		}
	}

	public void rollback() {
		ConnectionHandler.instance().rollback();
//		try {
//			this.conn.rollback();
//		} catch (SQLException e) {
//			throw new RuntimeException("Exception caught", e);
//		}
	}
	
	public void close() {
		ConnectionHandler.instance().close();
//		try {
//			this.conn.close();
//		} catch (SQLException e) {
//			throw new RuntimeException("Exception caught", e);
//		}
	}
	
	public Connection getConnection() {
		return this.conn;
	}
}
