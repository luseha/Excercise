package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		String qs = null;
		
		try {
			qs = "SELECT BookID, BookTitle, BookISBN FROM BookList";
			Class.forName("org.sqllite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:BookManagement.db");
			prst = connection.prepareStatement(qs);
			rs = prst.executeQuery();
			
			while (rs.next())
			{
				System.out.println(rs.getString("BookID" + " | " + rs.getString("BookTitle")));
			}
			
			rs.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
