package ch_08ex_01;

public class ShapeEx {

	public static void main(String[] args) {
		//Shape sh = new Shape();
		//compile error -> abstract class이기 때문에 instance 생성이 안 됨
		
		Shape [] sh = new Shape[3];
		sh[0] = new Rectangle();
		sh[1] = new Triangle();
		sh[2] = new Circle();
		
		for(Shape tempS : sh) {
			tempS.print();
			tempS.darw();
			
			if(tempS instanceof Rectangle) {
				((Rectangle)tempS).display(); // tempS.display();하면
				((Rectangle) tempS).display(); //((Rectangle) tempS).display();으로 자동캐스팅
			}
		}

	}

}
