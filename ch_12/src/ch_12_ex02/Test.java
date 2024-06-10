package ch_12_ex02;


public class Test {

	public static void main(String[] args) {
		int n = 10;
		int k = 3;

		int[] answer = new int [n / k];
        int cnt = 0;
        
        for(int i = 0 ; i < n ; i++) {
        	System.out.println((n-i) % k);
            if((n-i) % k == 0) {
                answer[cnt] = n-i;
                System.out.println(n-i);
                cnt++;
            }
        }
        
        String [] arrStr = {"abc", "def", "qwe"};
        
        System.out.println(arrStr.length);
        
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);

	}
}