package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement prst = null;
		String qs = null;
		
		try {
			qs = "DELETE FROM BookInfo WHERE BookID = ?";
			Class.forName("org.sqllite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:BookManagement.db");
			prst = connection.prepareStatement(qs);
			
			prst.setString(1, "7");
			
			prst.executeUpdate();
			
			System.out.println("저장되었습니다.");
//			rs.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
