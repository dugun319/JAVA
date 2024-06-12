package ch_15_ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OraSelect_02 {

	public static void main(String[] args) throws SQLException {
		
		String driver 	= "oracle.jdbc.driver.OracleDriver";
		String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
		String sql 		= "SELECT * FROM emp";
		
		Connection conn = null;
		Statement stmt	= null;
		ResultSet rs	= null;
		
		System.out.println("Eployee List");
		System.out.println("Ep.No.\tName\tJob\t\tSal\tDate");
		System.out.println("====================================================");

		try {
			Class.forName(driver);
			conn	= DriverManager.getConnection(url, "scott", "tiger");
			stmt	= conn.createStatement();
			rs		= stmt.executeQuery(sql);
			
			//System.out.println(stmt);
			
			if(rs.next()) {
				
				do {
					int		empno	= rs.getInt(1);
					String	ename	= rs.getString(2);
					String	job		= rs.getString(3);
					//int		sal		= rs.getInt("sal");
					int		sal		= rs.getInt(6);
					//Date	date	= rs.getDate("hiredate");
					Date	date	= rs.getDate(5);
					if(job.length() > 7) {
						System.out.printf("%d\t%s\t%s\t%d\t%TF\n", 
								empno, ename, job, sal, date);
					} else {
						System.out.printf("%d\t%s\t%s\t\t%d\t%TF\n", 
								empno, ename, job, sal, date);
					}
					
				} while (rs.next());
				
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
