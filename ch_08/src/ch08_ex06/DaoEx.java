package ch08_ex06;

public class DaoEx {
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		// -> 	DataAccessObject dao1 = new OracleDao();
		//		dbWork(dao1);
		//2줄을 1줄로 표현
		dbWork(new MySQLDao());
	}

}
