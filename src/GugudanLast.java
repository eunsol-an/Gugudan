import java.util.Scanner;

public class GugudanLast {
	
	public static void main(String[] args) {
		// ����ڰ� �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ����� ���
		
		// ��) ����ڰ� 8�� �Է��ϸ� 8*8���� ���
		System.out.println("�� ���� ����Ͻðڽ��ϱ�?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number + "*" + number + "���� ����մϴ�.");
		int[] result = new int[number];
		for (int i = 1; i < result.length; i++) {
			int dan = i + 1;
			for (int j = 0; j < result.length; j++) {
				result[j] = dan * (j + 1);
				System.out.println(result[j]);
			}

		}

		// ��) ����ڰ� 8,7�� �Է��ϸ� 8*7���� ���
		System.out.println("�� ���� ����Ͻðڽ��ϱ�?");
		Scanner in = new Scanner(System.in);
		String inputValue = in.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		System.out.println(first + "*" + second + "���� ����մϴ�.");
		result = new int[second];
		for (int i = 1; i < first; i++) {
			int dan = i + 1;
			for (int j = 0; j < result.length; j++) {
				result[j] = dan * (j + 1);
				System.out.println(result[j]);
			}

		}

	}

}
