package ch_06_ex01;



class Card {
	//instance (member, field) variable
	String kind;
	int number;
	
	//class variable
	static int width = 100;
	static int height = 250;
	
	//작성하지 않아도 기본적으로 생성됨.
	public Card() {
		
	}
	
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

public class CardTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체1 생성 -> 기본 생성자	
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		System.out.println("c1 : " + c1.kind + ", " + c1.number);
		System.out.println("c1 : " + Card.height + ", " + Card.width);
		
		Card c2 = new Card("Spade", 4);
		System.out.println("c2 : " + c2.kind + ", " + c2.number);
		System.out.println("c2 : " + Card.height + ", " + Card.width);
		

	}

}
