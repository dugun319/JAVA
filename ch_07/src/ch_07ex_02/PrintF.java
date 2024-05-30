package ch_07ex_02;

public class PrintF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1024;
		double doub = 3.1415926535;
		String str = "pneumonoultramicroscopicsilicovolcanoconiosis";
		
		System.out.println("Integer");
		
		System.out.printf("%d\n", num);
		System.out.printf("%+8d\n", num);
		System.out.printf("%-8d\n", num);
		
		System.out.println("\nDouble");
		
		System.out.printf("%f\n", doub);
		System.out.printf("%+8f\n", doub);
		System.out.printf("%-8f\n", doub);
		System.out.printf("%+16.8f\n", doub);
		System.out.printf("%-16.8f\n", doub);
		
		System.out.println("\nString");
		System.out.printf("%s\n", str);
		//범위를 넘어가면 글자수 형식이 무시됨
		//String은 + 연산자 사용이 불가능. 없이 사용하면 됨
		System.out.printf("%30s\n", str);
		System.out.printf("%-30s\n", str);
		System.out.printf("%50s\n", str);
		System.out.printf("%-50s\n", str);

	}

}
