package ch_13_ex01;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfo_01 {

	public static void main(String[] args) throws IOException {
		//File file = new File("src/ch_13_ex01/Buffer_01.java");
		File file = new File("src/ch_13_ex01/Textfile.txt");
		System.out.println("Directory\t : " + file.isDirectory());
		System.out.println("<< Detail of file >>");
		System.out.println("ABS path\t : " + file.getAbsolutePath());
		System.out.println("Can path\t : " + file.getCanonicalPath());
		System.out.println("LastMod\t\t : " + new Date(file.lastModified()));
		System.out.println("File Size\t : " + file.length());
		System.out.println("Read Property\t : " + file.canRead());
		System.out.println("Write Property\t : " + file.canWrite());
		System.out.println("Parent\t\t : " + file.getParent());
		System.out.println("IsHidden\t : " + file.isHidden());

	}

}
