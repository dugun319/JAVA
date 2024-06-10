package ch_11_ex03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx_01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pt = new Properties();
		String path = PropertiesEx_01.class.getResource("database.properties").getPath();
		System.out.println("1 Path : " + path);
		path = URLDecoder.decode(path, "utf-8");
		System.out.println("2 Path : " + path);
		pt.load(new FileReader(path));
		
		System.out.println("\n<Summons whole componet>");
		System.out.println(pt);
		System.out.println();
		
		String driver		= pt.getProperty("driver"); 
		String url			= pt.getProperty("url"); 
		String userName		= pt.getProperty("userName"); 
		String password		= pt.getProperty("password");
		
		System.out.println("driver\t\t: " + driver);
		System.out.println("url\t\t: " + url);
		System.out.println("userName\t: " + userName);
		System.out.println("password\t: " + password);

	}

}
