package day1;

public class ���ڿ� {

	public static void main(String[] args) {
		// ���ڴ� 1���� �ݵ��, ���ڿ��� 0���� �̻�
		// ���ڴ� �����ڵ�ǥ�� �ִ� ���� ���� ����ȴ�.
		char ch = 'A';
		//���� A�� ���� �����ڵ� ���� ���
		System.out.println((int)ch); //65
		ch = '��';
		//���� ���� ���� �����ڵ� ���� ���
		System.out.println((int)ch);
		ch = (char)66;
		//66�� ��ġ�ϴ� �����ڵ� ���ڰ� ���
		System.out.println(ch);
		//�̷��� ���ڿ��� �����ϱ� ���� Ŭ���� String ����
		//��� �⺻ ����Ÿ���� �ƴ϶� class
		//���ڿ� ''�� �ƴ� ""�� �̿�
		String str = "";
		System.out.println("���ڿ�:"+str);
		str = "�ȳ��ϼ���";
		System.out.println("���ڿ�:"+str);
	}

}
