package ch_09_ex03;

import java.util.StringTokenizer;

public class StringTok_01 {

	public static void main(String[] args) {

		StringTokenizer st	= new StringTokenizer("산딸기,집딸기.판딸기/밭딸기.하우스딸기", ".,/");
		String [] tempStr	= new String [st.countTokens()];
		int cnt				= 0;
		
		System.out.println(tempStr.length + "\n");
		
		
		while(st.hasMoreElements()) {
			//System.out.println(st.nextElement());
			tempStr[cnt] = (String)st.nextElement();
			System.out.println(tempStr[cnt]);
			cnt++;
		}
	}

}
