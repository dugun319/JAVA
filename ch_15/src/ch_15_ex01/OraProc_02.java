package ch_15_ex01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc_02 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the No. of employee : ");
		int empno = sc.nextInt();
		
		String driver 	= "oracle.jdbc.driver.OracleDriver";
		String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
		String sql 		= "{call EMP_info2 (?, ?, ?)}";
		
		Connection conn			= null;
		CallableStatement cs	= null;

		try {
			Class.forName(driver);
			conn	= DriverManager.getConnection(url, "scott", "tiger");
			cs 		= conn.prepareCall(sql);
			
			cs.setInt(1, empno);
			
			// out parameter
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
			cs.executeQuery();
			
			String ename	= cs.getString(2);
			int sal			= cs.getInt(3);
			
			System.out.println("Employee No.\t: " + empno);
			System.out.println("Employee Name\t: " + ename);
			System.out.println("Salary\t\t: " + sal);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(cs != null) {
				cs.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
		
		sc.close();
	}

}
