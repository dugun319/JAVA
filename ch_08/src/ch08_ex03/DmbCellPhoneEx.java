package ch08_ex03;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		/*
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속 받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone으로부터 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();

		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		 */
		DmbCellPhone dmbCellPHone = new DmbCellPhone(
				"Galaxy s22 Ultra", "White", 10);
		
		System.out.printf("Model\t : %s\n", dmbCellPHone.model);
		System.out.printf("Color\t : %s\n", dmbCellPHone.color);
		System.out.printf("Channel\t : %s\n", dmbCellPHone.channel);
		
		dmbCellPHone.powerOn();
		dmbCellPHone.bell();
		dmbCellPHone.sendVoice("Hello~~");
		dmbCellPHone.recieveVoice("Hello, this is Hong speaking");
		dmbCellPHone.sendVoice("Ah, what makes you calling?");
		dmbCellPHone.hangUp();
		
		dmbCellPHone.trunOnDmb();
		dmbCellPHone.changChannelDmb(12);
		dmbCellPHone.turnOffDmb();

	}

}
