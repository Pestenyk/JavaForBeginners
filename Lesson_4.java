import java.util.Scanner;

public class Lesson_4 {
	public static void main(String[] args) {
		
		// ������ ����� �����
		System.out.println("������ ����� �����");
		int num1 = readNum();
		
		// ������ ����� �����
		System.out.println("������ ����� �����");
		int num2 = readNum();

		/* �������� �� �������� ����� � �������� �� ���������� 
		���������� ������� ����������� �������� ��� ��� �� ������� ��������� */
		if(num1>num2) {
			int result = num1 - num2;
			System.out.println("��� ���������: " + result);
		} else {
			int result = num1 + num2;
			System.out.println("��� ���������: " + result);
		}
						
	}	
		
	// ������� ����� ��� ���������� ����� � ������
	public static int readNum() {

		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
}