package ch_09_ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {

	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", 
						"cA", "ca", "co", "c.", "cafe12",
						"ca0", "car", "combat", "count", 
						"data", "disc"};
		
		Pattern p = Pattern.compile("c[a-z]*");
		Pattern p1 = Pattern.compile("c[a-zA-Z]*");
		//-> c로 시작하는 소문자 영단어
		
		for(int i = 0 ; i < data.length ; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) {
				System.out.println(data[i] + ", ");
			}
		
		}
		
		for(int i = 0 ; i < data.length ; i++) {
			Matcher m = p1.matcher(data[i]);
			if(m.matches()) {
				System.out.println(data[i] + ", ");
			}
		
		}
	}

}
