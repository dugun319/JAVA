package ch02_ex02;

//Study->Review
public class IncDecEx {

	public static void main(String[] args) {
	      int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
	      int result1 = num1++;           // ++ 연산의 결과는 num1의 기존 값
	      // 8 Line 동일
	      // 1
	      result1 = num1;
	      // 2
	      num1++;

	      int result5 = ++num5;           // ++ 연산의 결과는 num5 
	      // 15 Line 동일
	      // 1
	      ++num5;   // num5 =num5 + 1
	      result5 = num5; 
	      
	      int result2 = num2--;           // -- 연산의 결과는 num2의 기존 값
	      int result3 = ++num3;           // ++ 연산의 결과는 num3의 새로운 값
	      int result4 = --num4;           // -- 연산의 결과는 num4의 새로운 값
	       
          System.out.println("result1 = " + result1); 
	      System.out.println("result2 = " + result2);
	      System.out.println("result3 = " + result3);
	      System.out.println("result4 = " + result4);
	      System.out.println("result5 = " + ++result3);
	      result3--;
	      System.out.println("result6 = " + result3++);
	      System.out.println("result3 = " + result3);


	}

}
