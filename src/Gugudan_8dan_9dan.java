import java.util.Scanner;

public class Gugudan_8dan_9dan {

	public static void main(String[] args) {
		// Scanner Ŭ������ �̿��Ͽ� ����ڿ��� �Է°� �ް�,
		// ���ǹ� if�� �̿��ؼ� 2�̻�, 9���ϸ� ������ ����ϱ�
		
		System.out.println("������ �� ����� ����? : ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		
		// and(&&) ������ ���
		if (number >= 2 && number <= 9) {
			System.out.println(number + "���� ����մϴ�.");
			for (int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		} else {
			System.out.println("2�̻�, 9���� ���� �Է��� �� �ֽ��ϴ�.");
		}
		
		
		// else if�� ���
		if (number < 2) {
			System.out.println("2�̻� ���� �Է����ּ���.");
		} else if (number > 9) {
			System.out.println("9���� ���� �Է����ּ���.");
		} else {
			System.out.println(number + "���� ����մϴ�.");
			for (int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}

	}

}
