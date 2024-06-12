package ch_15_ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySelect_02 {

	public static void main(String[] args) throws SQLException {
		String driver	= "com.mysql.cj.jdbc.Driver";
		String url		= "jdbc:mysql://127.0.0.1:3306/scottdb";
		String sql 		= "SELECT * FROM scottdb.professor";
		
		Connection conn = null;
		Statement stmt	= null;
		ResultSet rs	= null;
		
		System.out.println("MySQL List of EMP");
		System.out.println("ProfNo. NAME\tPosition\tSAL\tDpt No.");
		System.out.println("================================================");
		
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "MySQL84");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				do {
					int		profno		= rs.getInt(1);
					String	name		= rs.getString(2);
					String	position	= rs.getString("position");
					//String	position	= rs.getString(4);
					int		sal			= rs.getInt(5);
					int		dptno		= rs.getInt(8);
					
					System.out.printf("%d\t%s\t%s\t\t%d\t%d\n", 
							profno, name, position, sal, dptno);
				}while(rs.next());
			} else {
				System.out.println("There is no information");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
	}

}
