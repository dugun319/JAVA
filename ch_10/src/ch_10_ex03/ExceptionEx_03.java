package ch_10_ex03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx_03 {

	public static void main(String[] args) {
		 FileReader reader;
		 char [] buffer = new char [100];
		 String file_name = ".classpat";
		 
		 try {
			 reader = new FileReader(file_name);
			 reader.read(buffer, 0, 100);
			 String str = new String(buffer);
			 System.out.println("읽은 건 : \n" + str);
			 reader.close();
		 } catch (FileNotFoundException e) {
			 System.out.println("그런 파일 없음");
		 } catch (IOException e) {
			 System.out.println("못 읽는 파일");
		 } finally {
			 System.out.println("아무튼 읽었음");
		 }

	}

}
