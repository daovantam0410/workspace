package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Student;
import bean.ThoiKhoaBieu;

public class ThoiKhoaBieuDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public ThoiKhoaBieuDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
	
	protected void connect() throws SQLException {
		if(jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}
	}
	
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
	
	public List<ThoiKhoaBieu> findAll() throws SQLException{
		List<ThoiKhoaBieu> lists = new ArrayList<>();
		String sql = "SELECT * FROM tkb";
		connect();
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String monHoc = resultSet.getString("monHoc");
			int thu = resultSet.getInt("thu");
			int tietBatDau = resultSet.getInt("tietBatDau");
			int soTiet = resultSet.getInt("soTiet");
			String giangDuong = resultSet.getString("giangDuong");
			int tuanHoc = resultSet.getInt("tuanHoc");
			
			ThoiKhoaBieu thoiKhoaBieu = new ThoiKhoaBieu(id, monHoc, thu, tietBatDau, soTiet, giangDuong, tuanHoc);
			lists.add(thoiKhoaBieu);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return lists;
	}
	
	public List<Student> getAll() throws SQLException{
		List<Student> lists = new ArrayList<>();
		String sql = "SELECT * FROM Student";
		connect();
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String mSV = resultSet.getString("mSV");
			String hoTen = resultSet.getString("hoTen");

			Student student = new Student(mSV, hoTen);
			lists.add(student);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return lists;
	}

}
