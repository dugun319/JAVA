package ch_14;

class A1 { 
    int index = 1; 
    public void printVal() {
        System.out.print("A1 ");
        System.out.println(index);
    } 
}

class A2 extends A1{ 
    int index = 2; 
    public void printVal() {
        System.out.print("A2 ");
        System.out.println(index);
    } 
}

class A3 extends A2{ 
    int index = 3; 
    public void printVal() {
        System.out.print("A3 ");
        System.out.println(index);
    } 
}

class A4 extends A3{ 
    int index = 4; 
    public void printVal() {
        System.out.print("A4 ");
        System.out.println(index);
    } 
}

public class Test_05 {

	public static void main(String[] args) {
		A1 a1 = new A1();
        A1 a2 = new A2();
        A3 a3 = new A3();
        A1 a4 = new A4();
        
        System.out.print("Index 0f a1 ->" + a1.index + " ");
        a1.printVal();
        
        System.out.print("Index 0f a2 ->" + a2.index + " ");
        a2.printVal();
        
        System.out.print("Index 0f a3 ->" + a3.index + " ");
        a3.printVal();
        
        System.out.print("Index 0f a4 ->" + a4.index + " ");
        a4.printVal();

	}

}
