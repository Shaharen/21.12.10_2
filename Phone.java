package Exam01;

public interface Phone {
	// �������̽��� ������ ������ ���� �ü� �ִ� -> ���� �Ұ���
	// final�� ���� �����ϴ�
	
	// ��ư
	int button = 12;
	// ����Ŀ
	int speak = 4; 
	// ����ũ
	final int mic = 2;
	
	// �������
	public abstract void Camera();
	// ��ȭ���
	public abstract void Call();
	
	// �������̽����� �Ϲݸ޼ҵ�� ���� �� ����
	// -> �޼ҵ带 ���� �߻� �޼ҵ�� �ν�
	void Message(); // default abstract
	
	

}
