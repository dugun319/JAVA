package ch_11_ex02;

import java.util.TreeSet;

public class TreeSetEx_02 {

	public static void main(String[] args) {
		int i = 0;
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(52);
		ts.add(74);
		ts.add(31);
		ts.add(22);
		ts.add(78);
		ts.add(92);
		ts.add(52);
		
		for(Integer tempI : ts) {
			i++;
			System.out.println(i + " 번째 : " + tempI);
		}
		

	}

}
