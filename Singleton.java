package JavaPractice;

public class Singleton {
	//���� �ʵ�
	private static Singleton singleton = new Singleton(); //�ܺο��� ������ ȣ���� �������� private �ٿ���
	
	//������
	private Singleton() {}
	
	//�����޼ҵ�
	static Singleton getINstance() {
		return singleton;
	}
	
	public static void main(String[] args) {
		// �̱��� ��ü
		Singleton obj1 = Singleton.getINstance();
		Singleton obj2 = Singleton.getINstance();
		
		if(obj1 == obj2) {
			System.out.println("���� SIngleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� SIngleton ��ü�Դϴ�.");
		}
	}

}
