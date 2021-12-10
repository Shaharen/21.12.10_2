package Exam01;

public class Lollipop implements Phone {
	// 인터페이스 상속받을땐 implements 키워드 사용

	@Override
	public void Camera() {
		System.out.println("사진을 찍다");
	}

	@Override
	public void Call() {
		System.out.println("전화하다");
	}

	@Override
	public void Message() {
		System.out.println("메시지를 보내다");
	}

}
