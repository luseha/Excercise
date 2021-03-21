package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement prst = null;
		String qs = null;
		
		try {
			qs = "INSERT INTO BookInfo (BookID,BookTitle,BookISBN) VALUES(?, ?, ?)";
			Class.forName("org.sqllite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:BookManagement.db");
			prst = connection.prepareStatement(qs);
			
			
			prst.executeUpdate();
			
			System.out.println("저장되었습니다.");
//			rs.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
