package ch_09_ex03;

public class String_05 {

	public static void main(String[] args) {
		String fullName	= "Hello.java.exe";
		int index		= fullName.indexOf('.');
		
		System.out.println("Index -> " + index);
		String fileName = fullName.substring(0, index);
		
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName + "의 화일명은 " + fileName);
		System.out.println(fullName + "의 확장자는 " + ext);
		
		ext = "exe";
		
		
		System.out.println(fullName.replaceAll(ext, "bat"));
		System.out.println(fullName.replaceAll("exe", "bat"));
		System.out.println(fullName.replaceAll("java.exe", "bat"));
		System.out.println(fullName.replaceAll(".", "/"));
		
		System.out.println(fullName.replace(ext, "bat"));
		System.out.println(fullName.replace("exe", "bat"));
		System.out.println(fullName.replace("java.exe", "bat"));
		System.out.println(fullName.replace(".", "/"));
		
		
	}

}
