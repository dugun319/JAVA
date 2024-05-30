package ch_07ex_01;

class Con1 {
	void hi(int cnt) {
		/*
		if(cnt >= 0) {
			System.out.printf("Hi, It's Me ~~ || cnt : %d\n", cnt);
			hi(--cnt);
		} else {
			return;
		}
		*/
		
		System.out.printf("Hi, It's Me ~~ || cnt : %d\n", cnt);
		if(cnt < 1) {
			return;
		}
		hi(--cnt);
		
	}
}

public class HiEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Con1 d = new Con1();
		d.hi(6);
	}

}
