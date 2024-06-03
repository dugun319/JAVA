package ch_09_ex01;

class Point3D {
	int x;
	int y;
	int z;
	
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public boolean equals(Point3D p3D) {
		boolean result = false;
		if((this.x == p3D.x) && (this.y == p3D.y)) {
			result = true;
			return result;
		} else {
			return result;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();
		String showStr = "[x = " + x + ", y = " + y + ", z = " + z + "]";
		return showStr;
				
	}
}

public class Point3DEx {

	public static void main(String[] args) {
		Point3D p3D_01 = new Point3D(1, 2, 3);
		Point3D p3D_02 = new Point3D(1, 2, 4);
		Point3D p3D_03 = new Point3D(1, 2, 5);
		
		if(p3D_01.equals(p3D_02)) {
			System.out.println("They are both the same");
		} else {
			System.out.println("They are different each other");
		}
		
		if(p3D_01 == p3D_02) {
			System.out.println("They are both the same");
		} else {
			System.out.println("They are different each other");
		}
		
		System.out.println(p3D_01);
		System.out.println(p3D_03);
		
	}

}
